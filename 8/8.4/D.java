public class D
{
	public static void main(String[] args)throws Exception{
		Runtime rt = Runtime.getRuntime();
		Process p = rt.exec("java -version");
        //rt.exec(new String("cmd.exe /c COLOR a"));
	}
}