import java.awt.*;
import static java.awt.BorderLayout.*;
public class BorderLayoutTest2{
	public static void main(String[] args){
		Frame f=new Frame("����");
		f.setLayout(new BorderLayout(30,5));
		f.add(new Button("��"),SOUTH);
		f.add(new Button("��"),NORTH);

		Panel p=new Panel();
		p.add(new TextField(20));
		p.add(new Button("���"));

		f.add(p);
		f.add(new Button("��"),EAST);
		f.pack();
		f.setVisible(true);
	}
}