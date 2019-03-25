import java.awt.*;
import java.awt.event.*;
public class WindowListenerTest{
	private Frame f=new Frame("����");
	private TextArea ta=new TextArea(6,40);
	
	public void init(){
		f.addWindowListener(new MyListener());
		f.add(ta);
		f.pack();
		f.setVisible(true);
	}
	class MyListener implements WindowListener{
		public void windowActivated(WindowEvent e){
			ta.append("���ڱ�����!");
			System.out.println("���ڱ�����!");
		}
		public void windowClosed(WindowEvent e){
			ta.append("���ڳɹ��ر�!");
			System.out.println("���ڳɹ��ر�!");
		}
		public void windowClosing(WindowEvent e){
			ta.append("�û��رմ���!");
			System.out.println("�û��رմ���!");
			System.exit(0);
		}
		public void windowDeactivated(WindowEvent e){
			ta.append("����ʧȥ����!");
			System.out.println("����ʧȥ����!");
		}
		public void windowDeiconified(WindowEvent e){
			ta.append("���ڱ��ָ�!");
			System.out.println("���ڱ��ָ�!");
		}
		public void windowIconified(WindowEvent e){
			ta.append("���ڱ���С��!");
			System.out.println("���ڱ���С��!");
		}
		public void windowOpened(WindowEvent e){
			ta.append("���ڱ����δ�!");
			System.out.println("���ڱ����δ�!");
		}
	}
	public static void main(String[] args)
	{
		new WindowListenerTest().init();
	}
}