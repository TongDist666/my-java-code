import java.awt.*;
public class ScrollPaneTest{
	public static void main(String[] args){
		Frame f=new Frame("����");
		ScrollPane s=new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);

		s.add(new TextField(10));
		s.add(new Button("���"));
		f.add(s);
		f.setBounds(30,30,200,200);
		f.setVisible(true);
	}
}