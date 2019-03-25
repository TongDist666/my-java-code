public class VariableOverrideTest{

	private String name="全局name";
	private static double age=78.0;
	public static void main(String[] args){
		int age=78;
		System.out.println(age);
		System.out.println(VariableOverrideTest.age);
		new VariableOverrideTest().info();
	}
	public void info(){
		String name="方法name";
		System.out.println(name);
		System.out.println(this.name);
	}
}