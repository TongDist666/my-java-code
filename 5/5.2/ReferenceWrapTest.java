class DataWrap
{
	int a;
	int b;
}

public class ReferenceWrapTest 
{
	public static void wrap(DataWrap dw){
		
		int temp=dw.a;
		dw.a=dw.b;
		dw.b=temp;
		System.out.println("a="+dw.a+"\nb="+dw.b);
		dw=null;
	}
	public static void main(String[] args) 
	{
		DataWrap dw=new DataWrap();
		dw.a=1;
		dw.b=2;
		wrap(dw);
		System.out.println("a="+dw.a+"\nb="+dw.b);
	}
}
