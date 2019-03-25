import java.awt.*;
import java.awt.event.*;
public class SendMailer{
	private Frame f=new Frame("sender");
	private TextField t=new TextField(40);
	private Button b=new Button("send");

	public void init(){
		b.addActionListener(new MailerListener(t));
		f.add(t);
		f.add(b,BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args){
		new SendMailer().init();
	}
}