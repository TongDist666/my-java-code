import java.io.*;
import java.net.*;
public class ClientThread implements Runnable{
	private Socket s;
	BufferedReader br=null;
	public ClientThread(Socket s)throws IOException{
		this.s=s;
		br=new BufferedReader(new InputStreamReader(s.getInputStream()));
	}
	public void run(){
		try{
			String content=null;
			while((content=br.readLine())!=null){
				System.out.println(content);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}