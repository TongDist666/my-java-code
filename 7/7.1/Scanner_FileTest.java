import java.util.*;
import java.io.*;

public class Scanner_FileTest
{
	public static void main(String[] args)
		throws Exception
	{
		// 将一个File对象作为Scanner的构造器参数，Scanner读取文件内容
		Scanner sc = new Scanner(new File("Scanner_FileTest.java"));
		System.out.println("ScannerFileTest.java文件内容如下：");
		// 判断是否还有下一行
		while(sc.hasNextLine())
		{
			// 输出文件中的下一行
			System.out.println(sc.nextLine());
		}
	}
}

