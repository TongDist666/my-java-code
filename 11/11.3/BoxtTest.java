import java.awt.*;
import javax.swing.*;
public class BoxtTest{
	private Frame f=new Frame("测试");
	private Box b1=Box.createHorizontalBox();
	private Box b2=Box.createVerticalBox();
	public void init(){
		b1.add(new Button("水平1"));
		b1.add(new Button("水平2"));
		b2.add(new Button("垂直1"));
		b2.add(new Button("垂直2"));
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args){
		new BoxtTest().init();
	}
}