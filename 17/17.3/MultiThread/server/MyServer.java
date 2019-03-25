import java.net.*;
import java.io.*;
import java.util.*;
public class MyServer{
	public static List<Socket> socketList=Collections.synchronizedList(new ArrayList<>());
	public static void main(String[] args)throws IOException{
		ServerSocket ss=new ServerSocket(30000);
		while(true){
			Socket s=ss.accept();
			socketList.add(s);
			new Thread(new ServerThread(s)).start();
		}
	}
}