import java.io.*;
import java.net.*;
import java.util.*;
public class Server{
	public static void main(String[] args)throws Exception{
		ServerSocket ss=new ServerSocket(30000);
		Socket socket=ss.accept();
		PrintStream ps=new PrintStream(socket.getOutputStream());
		ps.println("Server 的第一行数据！");
		ps.println("Server 的第二行数据！");
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