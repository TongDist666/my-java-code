public class DrawThread extends Thread{
	private Account account;
	private double drawAmount;
	public DrawThread(String name,Account account,double drawAmount){
		super(name);
		this.account=account;
		this.drawAmount=drawAmount;
	}
	public void run(){
		if(account.getbalance()>=drawAmount){
			System.out.println(getName()+"ȡǮ�ɹ����³���Ʊ��"+drawAmount);
			/*try{
				Thread.sleep(1);
			}catch(InterruptedException ex){
				ex.printStackTrace();
			}
			*/
			account.setbalance(account.getbalance()-drawAmount);
			System.out.println("\t���Ϊ��"+account.getbalance());
		}
		else{
			System.out.println(getName()+"ȡǮʧ�ܣ����㣡");
		}
	}
}