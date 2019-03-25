import java.io.*;
public class AutoCloseTest{
	public static void main(String[] args)throws IOException{
		try(
			BufferedReader br=new BufferedReader(new FileReader("AutoCloseTest.java"));
			PrintStream ps=new PrintStream(new FileOutputStream("a.txt")))
		{
			System.out.println(br.readLine());
			ps.println("123");
		}
	}
}