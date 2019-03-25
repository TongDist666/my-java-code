import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.util.concurrent.*;
public class AIOClient{
	final static String UTF_8="utf-8";
	final static int PORT=30000;
	AsynchronousSocketChannel clientChannel;
	JFrame mainWin=new JFrame("��������");
	JTextArea jta=new JTextArea(16,48);
	JTextField jtf=new JTextField(40);
	JButton sendBn=new JButton("����");
	public void init(){
		mainWin.setLayout(new BorderLayout());
		jta.setEditable(false);
		mainWin.add(new JScrollPane(jta),BorderLayout.CENTER);
		JPanel jp=new JPanel();
		jp.add(jtf);
		jp.add(sendBn);
		Action sendAction=new AbstractAction(){
			public void actionPerformed(ActionEvent e){
				String content=jtf.getText();
				if(content.trim().length()>0){
					try{
						clientChannel.write(ByteBuffer.wrap(content.trim().getBytes(UTF_8))).get();
					}
					catch(Exception ex){
						ex.printStackTrace();	
					}
				}
				jtf.setText("");
			}
		};
		sendBn.addActionListener(sendAction);
		jtf.getInputMap().put(KeyStroke.getKeyStroke('\n',java.awt.event.InputEvent.CTRL_MASK),"send");
		jtf.getActionMap().put("send",sendAction);
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWin.add(jp,BorderLayout.SOUTH);
		mainWin.pack();
		mainWin.setVisible(true);
	}
	public void connect()throws Exception{
		final ByteBuffer buff=ByteBuffer.allocate(1024);
		ExecutorService executor=Executors.newFixedThreadPool(80);
		AsynchronousChannelGroup channelGroup=AsynchronousChannelGroup.withThreadPool(executor);
		clientChannel=AsynchronousSocketChannel.open(channelGroup);
		clientChannel.connect(new InetSocketAddress("127.0.0.1",PORT)).get();
		jta.append("---����������ӳɹ���---\n");
		buff.clear();
		clientChannel.read(buff,null,new CompletionHandler<Integer,Object>(){
			@Override
			public void completed(Integer result,Object attachment){
				buff.flip();
				String content=StandardCharsets.UTF_8.decode(buff).toString();
				jta.append("ĳ��˵��"+content+"\n");
				buff.clear();
				clientChannel.read(buff,null,this);
			}
			@Override
			public void failed(Throwable ex,Object attachment){
				System.out.println("��ȡʧ�ܣ�"+ex);
			}
		});
	}
	public static void main(String[] args)throws Exception{
		AIOClient client=new AIOClient();
		client.init();
		client.connect();
	}
}