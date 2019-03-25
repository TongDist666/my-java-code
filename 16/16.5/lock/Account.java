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
	public void setbalance(double newbalance){
		this.balance=newbalance;
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