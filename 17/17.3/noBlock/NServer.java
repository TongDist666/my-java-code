import java.io.*;
import java.net.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
public class NServer{
	private Selector selector=null;
	static final int PORT=30000;
	private Charset charset=Charset.forName("UTF-8");

	public void init()throws IOException{
		selector=Selector.open();
		ServerSocketChannel server=ServerSocketChannel.open();
		InetSocketAddress isa=new InetSocketAddress("127.0.0.1",PORT);
		server.bind(isa);
		server.configureBlocking(false);
		server.register(selector,SelectionKey.OP_ACCEPT);
		while(selector.select()>0){
			for(SelectionKey sk:selector.selectedKeys()){
				selector.selectedKeys().remove(sk);
				if(sk.isAcceptable()){
					SocketChannel sc=server.accept();
					sc.configureBlocking(false);
					sc.register(selector,SelectionKey.OP_READ);
					sk.interestOps(SelectionKey.OP_ACCEPT);
				}
				if(sk.isReadable()){
					SocketChannel sc=(SocketChannel)sk.channel();
					ByteBuffer buff=ByteBuffer.allocate(1024);
					String content="";
					try{
						while(sc.read(buff)>0){
							buff.flip();
							content+=charset.decode(buff);
						}
						System.out.println("读取的数据是："+content);
						sk.interestOps(SelectionKey.OP_READ);
					}
					catch(IOException ex){
						sk.cancel();
						if(sk.channel()!=null){
							sk.channel().close();
						}
					}
					if(content.length()>0){
						for(SelectionKey key:selector.keys()){
							Channel targetChannel=key.channel();
							if(targetChannel instanceof SocketChannel){
								SocketChannel dest=(SocketChannel)targetChannel;
								dest.write(charset.encode(content));
							}
						}
					}
				}
			}
		}
	}
	public static void main(String[] args)throws IOException{
		new NServer().init();
	}
}