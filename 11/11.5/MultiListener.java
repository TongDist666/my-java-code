import java.awt.*;
import java.awt.event.*;
public class MultiListener{
	private Frame f=new Frame("����");
	private TextArea ta=new TextArea(6,40);
	private Button b1=new Button("��ť1");
	private Button b2=new Button("��ť2");

	public void init(){
		FirstListener f1=new FirstListener();
		b1.addActionListener(f1);
		b1.addActionListener(new SecondListener());
		b2.addActionListener(f1);

		f.add(ta);
		Panel p=new Panel();
		p.add(b1);
		p.add(b2);
		f.add(p,BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	class FirstListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			ta.append("��һ���¼����������������¼�Դ��"+e.getActionCommand()+"\n");
		}
	}
	class SecondListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			ta.append("�ڶ����¼����������������¼�Դ��"+e.getActionCommand()+"\n");
		}
	}
	public static void main(String[] args){
		new MultiListener().init();
	}
}