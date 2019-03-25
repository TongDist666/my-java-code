import java.awt.*;
public class GridBagTest{
	private Frame f=new Frame("≤‚ ‘");
	private GridBagLayout gb=new GridBagLayout();
	private GridBagConstraints gbc=new GridBagConstraints();
	private Button[] bs=new Button[10];
	public void init(){
		f.setLayout(gb);
		for(int i=0;i<bs.length;i++){
			bs[i]=new Button("∞¥≈•"+i);
		}
		gbc.fill=GridBagConstraints.BOTH;
		gbc.weightx=1;
		show_message(gbc);
		addButton(bs[0]);
		addButton(bs[1]);
		addButton(bs[2]);
		
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		//gbc.fill=GridBagConstraints.BOTH;
		//gbc.weightx=1;
		show_message(gbc);
		addButton(bs[3]);

		//gbc.gridwidth=GridBagConstraints.REMAINDER;
		//gbc.fill=GridBagConstraints.BOTH;
		gbc.weightx=0;
		show_message(gbc);
		addButton(bs[4]);

		gbc.gridwidth=2;
		show_message(gbc);
		addButton(bs[5]);

		gbc.gridwidth=1;
		gbc.gridheight=2;
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		show_message(gbc);
		addButton(bs[6]);

		gbc.gridwidth=1;
		gbc.gridheight=2;
		gbc.weighty=1;
		show_message(gbc);
		addButton(bs[7]);

		gbc.weighty=0;
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		gbc.gridheight=1;
		show_message(gbc);
		addButton(bs[8]);
		addButton(bs[9]);

		f.pack();
		f.setVisible(true);
	}
	private void addButton(Button button){
		gb.setConstraints(button,gbc);
		f.add(button);
	}
	private void show_message(GridBagConstraints gbc){
		System.out.println("gbc.gridx="+gbc.gridx+" gbc.gridy="+gbc.gridy);
		System.out.println("gbc.gridwidth="+gbc.gridwidth+" gbc.gridheight="+gbc.gridheight);
		System.out.println("gbc.fill="+gbc.fill);
		System.out.println("gbc.weightx="+gbc.weightx+" gbc.weighty="+gbc.weighty+"\n");
	}
	public static void main(String[] args){
		new GridBagTest().init();
	}
}