public class Account{
	private String accountNo;
	private double balance;
	private boolean flag=false;
	public Account(){}
	public Account(String accountNo,double balance){
		this.accountNo=accountNo;
		this.balance=balance;
	}
	public String getAccountNo(){
		return this.accountNo;
	}
	public void setAccountNo(String accountNo){
		this.accountNo=accountNo;
	}
	public double getBalance(){
		return this.balance;
	}
	public synchronized void draw(double drawAmount){
		try{
			if(!flag){
				wait();
			}
			else{
				System.out.println(Thread.currentThread().getName()+"ȡǮ��"+drawAmount);
				balance-=drawAmount;
				System.out.println("�˻����Ϊ��"+balance);
				flag=false;
				notifyAll();
			}
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
	}
	public synchronized void deposit(double depositAmount){
		try{
			if(flag){
				wait();
			}
			else{
				System.out.println(Thread.currentThread().getName()+"��"+depositAmount);
				balance+=depositAmount;
				System.out.println("�˻����Ϊ��"+balance);
				flag=true;
				notifyAll();
			}
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
	}
	public int hashCode(){
		return accountNo.hashCode();
	}
	public boolean equals(Object obj){
		if(this==obj) return true;
		if(obj!=null && obj.getClass()==Account.class){
			Account target=(Account)obj;
			return target.getAccountNo().equals(accountNo);
		}
		return false;
	}
}