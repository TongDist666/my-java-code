public class ReturnThis 
{
	public int age;
	public ReturnThis grow(){
		age++;
		return this;
	}
	public static void main(String[] args) 
	{
		ReturnThis t=new ReturnThis();
		t.grow().grow().grow();
		System.out.println("Hello World!"+"\n"+t.age);
	}
}
