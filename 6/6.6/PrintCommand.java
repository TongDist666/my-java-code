public class PrintCommand implements Commend
{
	public void process(int[] target)
	{
		for (int tmp : target )
		{
			System.out.println("�������Ŀ�������Ԫ��:" + tmp);
		}
	}
}
