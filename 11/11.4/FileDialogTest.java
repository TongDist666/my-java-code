import java.awt.*;
public class FileDialogTest{
	Frame f=new Frame("测试");
	FileDialog d1=new FileDialog(f,"选择需要打开的文件",FileDialog.LOAD);
	FileDialog d2=new FileDialog(f,"选择保存文件的路径",FileDialog.SAVE);
	Button b1=new Button("open");
	Button b2=new Button("save");
	public void init(){
		b1.addActionListener(e->{
			d1.setVisible(true);
			System.out.println(d1.getDirectory()+d1.getFile());
		});
		b2.addActionListener(e->{
			d2.setVisible(true);
			System.out.println(d2.getDirectory()+d2.getFile());
		});
		f.add(b1);
		f.add(b2,BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args){
		new FileDialogTest().init();
	}
}