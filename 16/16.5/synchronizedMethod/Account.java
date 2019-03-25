public class Account{
	private String accountNo;
	private double balance;
	public Account(){}
	public Account(String accountNo,double balance){
		this.accountNo=accountNo;
		this.balance=balance;
	}
	public String getaccountNo(){
		return this.accountNo;
	}
	public double getbalance(){
		return this.balance;
	}
	public void setaccountNo(String newaccountNo){
		this.accountNo=newaccountNo;
	}
	public synchronized void draw(double drawAmount)
	{
		if (balance >= drawAmount)
		{
			System.out.println(Thread.currentThread().getName()
				+ "ȡǮ�ɹ����³���Ʊ:" + drawAmount);
			try
			{
				Thread.sleep(1);
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
			balance -= drawAmount;
			System.out.println("\t���Ϊ: " + balance);
		}
		else
		{
			System.out.println(Thread.currentThread().getName()
				+ "ȡǮʧ�ܣ����㣡");
		}
	}
	public int hashCode(){
		return accountNo.hashCode();
	}
	public boolean equals(Object obj){
		if(this==obj) return true;
		if(obj!=null && obj.getClass()==Account.class){
			Account target=(Account)obj;
			return target.getaccountNo().equals(accountNo);
		}
		return false;
	}
}