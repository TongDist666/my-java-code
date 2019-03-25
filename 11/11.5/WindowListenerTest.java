import java.awt.*;
import java.awt.event.*;
public class WindowListenerTest{
	private Frame f=new Frame("测试");
	private TextArea ta=new TextArea(6,40);
	
	public void init(){
		f.addWindowListener(new MyListener());
		f.add(ta);
		f.pack();
		f.setVisible(true);
	}
	class MyListener implements WindowListener{
		public void windowActivated(WindowEvent e){
			ta.append("窗口被激活!");
			System.out.println("窗口被激活!");
		}
		public void windowClosed(WindowEvent e){
			ta.append("窗口成功关闭!");
			System.out.println("窗口成功关闭!");
		}
		public void windowClosing(WindowEvent e){
			ta.append("用户关闭窗口!");
			System.out.println("用户关闭窗口!");
			System.exit(0);
		}
		public void windowDeactivated(WindowEvent e){
			ta.append("窗口失去焦点!");
			System.out.println("窗口失去焦点!");
		}
		public void windowDeiconified(WindowEvent e){
			ta.append("窗口被恢复!");
			System.out.println("窗口被恢复!");
		}
		public void windowIconified(WindowEvent e){
			ta.append("窗口被最小化!");
			System.out.println("窗口被最小化!");
		}
		public void windowOpened(WindowEvent e){
			ta.append("窗口被初次打开!");
			System.out.println("窗口被初次打开!");
		}
	}
	public static void main(String[] args)
	{
		new WindowListenerTest().init();
	}
}