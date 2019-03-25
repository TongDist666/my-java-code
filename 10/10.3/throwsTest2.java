import java.io.*;
public class throwsTest2{
	public static void main(String[] args)throws Exception{
		test();
	}
	public static void test()throws IOException{
		FileInputStream f=new FileInputStream("a.txt");
	}
}