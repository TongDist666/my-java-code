import java.net.*;
import java.io.*;
public class Server{
	public static void main(String[] args)throws IOException{
		ServerSocket ss=new ServerSocket(30000);
		while(true){
			Socket s=ss.accept();
			PrintStream ps=new PrintStream(s.getOutputStream());

			ps.println("hi~~from server!");
			ps.close();
			s.close();
		}
	}
}