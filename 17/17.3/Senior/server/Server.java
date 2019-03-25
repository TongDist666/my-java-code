import java.io.*;
import java.net.*;
public class Server{
	private static final int SERVER_PORT =30000;
	public static CrazyitMap<String,PrintStream> clients=new CrazyitMap<>();
	public void init(){
		try(ServerSocket ss=new ServerSocket(SERVER_PORT)){
			while(true){
				Socket socket=ss.accept();
				new ServerThread(socket).start();
			}
		}
		catch(IOException ie){
			System.out.println("����������ʧ�ܡ��Ƿ�˿ڣ�"+SERVER_PORT+"��ռ�ã�");
		}
	}
	public static void main(String[] args){
		Server server=new Server();
		server.init();
	}
}