public class DrawTest{
	public static void main(String[] args){
		Account ac=new Account("123",0);
		new DrawThread("ȡǮ��",ac,800).start();
		new DepositThread("����߼�1",ac,800).start();
		new DepositThread("�������222",ac,800).start();
		new DepositThread("����߱�33333",ac,800).start();
	}
}