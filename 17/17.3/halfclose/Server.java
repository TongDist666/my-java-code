import java.io.*;
import java.net.*;
import java.util.*;
public class Server{
	public static void main(String[] args)throws Exception{
		ServerSocket ss=new ServerSocket(30000);
		Socket socket=ss.accept();
		PrintStream ps=new PrintStream(socket.getOutputStream());
		ps.println("Server �ĵ�һ�����ݣ�");
		ps.println("Server �ĵڶ������ݣ�");
		socket.shutdownOutput();
		System.out.println(socket.isClosed());
		Scanner scan=new Scanner(socket.getInputStream());
		while(scan.hasNextLine()){
			System.out.println(scan.nextLine());
		}
		scan.close();
		socket.close();
		ss.close();
	}
}