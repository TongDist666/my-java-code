import java.awt.*;
import java.awt.event.*;
public class MailerListener implements ActionListener{
	private TextField mailAddress;
	public MailerListener(){};
	public MailerListener(TextField mailAddress){
		this.mailAddress=mailAddress;
	}
	public void setMailerListener(TextField mailAddress){
		this.mailAddress=mailAddress;
	}
	public void actionPerformed(ActionEvent e){
		System.out.println("程序向 "+mailAddress.getText()+" 发送邮件");
	}
}