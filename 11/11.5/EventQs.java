import java.awt.*;
import java.awt.event.*;
public class EventQs{
	private Frame f=new Frame("����");
	private Button b=new Button("ȷ��");
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
			System.out.println("�û������OK");
			t.setText("hello world!");
		}
	}
	public static void main(String[] args){
		new EventQs().init();
	}
}