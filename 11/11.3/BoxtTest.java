import java.awt.*;
import javax.swing.*;
public class BoxtTest{
	private Frame f=new Frame("����");
	private Box b1=Box.createHorizontalBox();
	private Box b2=Box.createVerticalBox();
	public void init(){
		b1.add(new Button("ˮƽ1"));
		b1.add(new Button("ˮƽ2"));
		b2.add(new Button("��ֱ1"));
		b2.add(new Button("��ֱ2"));
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args){
		new BoxtTest().init();
	}
}