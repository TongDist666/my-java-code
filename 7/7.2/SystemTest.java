import java.io.*;
import java.util.*;
public class SystemTest{
	public static void main(String[] args)throws Exception
		{
		Map<String,String> env=System.getenv();
		for(String name:env.keySet()){
		System.out.println(name+"-->"+env.get(name));
		}
		System.out.println(System.getenv("JAVA_HOME"));
		Properties props=System.getProperties();
		props.store(new FileOutputStream("pros.txt"),"System Properties");
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.currentTimeMillis());
	}
}