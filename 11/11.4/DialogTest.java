import java.awt.*;
public class DialogTest{
	Frame f=new Frame("²âÊÔ");
	Dialog d1=new Dialog(f,"model",true);
	Dialog d2=new Dialog(f,"nomodel",false);
	Button b1=new Button("model dialog");
	Button b2=new Button("nomodel dialog");
	public void init(){
		d1.setBounds(20,30,300,400);
		d2.setBounds(20,30,300,400);
		b1.addActionListener(e->d1.setVisible(true));
		b2.addActionListener(e->d2.setVisible(true));

		f.add(b1);
		f.add(b2,BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args){
		new DialogTest().init();
	}
}