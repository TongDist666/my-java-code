import java.awt.*;
import javax.swing.*;
public class BoxSpaceTest{
	private Frame f=new Frame("����");
	private Box b1=Box.createHorizontalBox();
	private Box b2=Box.createVerticalBox();
	public void init(){
		b1.add(new Button("ˮƽ1"));
		b1.add(Box.createHorizontalGlue());
		b1.add(new Button("ˮƽ2"));
		b1.add(Box.createHorizontalStrut(10));
		b1.add(new Button("ˮƽ3"));

		b2.add(new Button("��ֱ1"));
		b2.add(Box.createVerticalGlue());
		b2.add(new Button("��ֱ2"));
		b2.add(Box.createVerticalStrut(10));
		b2.add(new Button("��ֱ3"));

		f.add(b1,BorderLayout.NORTH);
		f.add(b2);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args){
		new BoxSpaceTest().init();
	}
}