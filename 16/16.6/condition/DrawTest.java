public class DrawTest{
	public static void main(String[] args){
		Account ac=new Account("123",0);
		new DrawThread("取钱者",ac,800).start();
		new DepositThread("存款者甲1",ac,800).start();
		new DepositThread("存款者乙222",ac,800).start();
		new DepositThread("存款者丙33333",ac,800).start();
	}
}