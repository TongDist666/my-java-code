
public class Person
{
	// ���涨��һ����ʼ����
	{
		int a = 6;
		if (a > 4)
		{
			System.out.println("Person��ʼ���飺�ֲ�����a��ֵ����4");
		}
		System.out.println("Person�ĳ�ʼ����");
	}
	
	// �����޲����Ĺ�����
	public Person()
	{
		System.out.println("Person����޲���������");
	}
	// ����ڶ�����ʼ����
	{
		System.out.println("Person�ĵڶ�����ʼ����");
	}
	public static void main(String[] args)
	{
		new Person();
	}
}
