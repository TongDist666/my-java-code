import java.awt.*;
import static java.awt.BorderLayout.*;
public class GridLayoutTest{
	public static void main(String[] args){
		Frame f=new Frame("����");
		Panel p1=new Panel();
		p1.add(new TextField(30));
		f.add(p1,NORTH);
		Panel p2=new Panel();
		p2.setLayout(new GridLayout(3,5,4,4));
		String[] name={"0","1","2","3","4","5","6","7","8","9","+","-","*","/","."};
		for(String b:name){
			p2.add(new Button(b));
		}
		f.add(p2);
		f.pack();
		f.setVisible(true);
	}
}