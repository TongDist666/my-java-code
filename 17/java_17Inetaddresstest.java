import java.net.InetAddress; 
public class  java_17Inetaddresstest
{
	public static void main(String[] args) 
		throws Exception
	{
		
		InetAddress ip=InetAddress.getByName("www.baidu.com");
		System.out.println("crazy�Ƿ�ɴ"+ip.isReachable(2000));
		System.out.println(ip.getHostAddress());

		InetAddress local=InetAddress.getByAddress(new byte[]{127,0,0,1});
		System.out.println("�����Ƿ�ɴ"+local.isReachable(5000));
		System.out.println("Hello World!");
	}
}