public class StaticAcessNostatic 
{
	public void info(){
				System.out.println("static info��");
	}
	public static void main(String[] args) 
	{
		//StaticAcessNostatic.java:8: ����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� info()
		//info();
		//new StaticAccessNonStatic().info();//�ܲ��ˣ�����
		new StaticAcessNostatic().info();
		System.out.println("Hello World!");
	}
}
