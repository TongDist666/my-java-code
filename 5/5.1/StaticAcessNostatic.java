public class StaticAcessNostatic 
{
	public void info(){
				System.out.println("static info！");
	}
	public static void main(String[] args) 
	{
		//StaticAcessNostatic.java:8: 错误: 无法从静态上下文中引用非静态 方法 info()
		//info();
		//new StaticAccessNonStatic().info();//跑不了？？？
		new StaticAcessNostatic().info();
		System.out.println("Hello World!");
	}
}
