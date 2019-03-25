import java.awt.*;
import java.awt.event.*;
public class EventQs{
	private Frame f=new Frame("测试");
	private Button b=new Button("确定");
	private TextField t=new TextField(30);
	public void init(){
		b.addActionListener(new OKListener());
		f.add(t);
		f.add(b,BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	class OKListener implements ActionListener{
		public void actionPerformed(ActionEvent a){
			System.out.println("用户点击了OK");
			t.setText("hello world!");
		}
	}
	public static void main(String[] args){
		new EventQs().init();
	}
}