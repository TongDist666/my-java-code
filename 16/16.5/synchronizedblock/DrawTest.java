public class DrawTest{
	public static void main(String[] args){
		Account acct=new Account("112233",1000);

		new DrawThread("��",acct,800).start();
		new DrawThread("��",acct,800).start();
	}
}