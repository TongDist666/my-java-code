import java.net.*;
import java.io.*;
import java.util.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.util.concurrent.*;
public class AIOServer{
	static final int PORT = 30000;
	final static String UTF_8 = "utf-8";
	static List<AsynchronousSocketChannel> channelList= new ArrayList<>();
	public void startListen() throws InterruptedException,Exception{
		ExecutorService executor = Executors.newFixedThreadPool(20);
		AsynchronousChannelGroup channelGroup = AsynchronousChannelGroup.withThreadPool(executor);
		AsynchronousServerSocketChannel serverChannel= AsynchronousServerSocketChannel.open(channelGroup).bind(new InetSocketAddress(PORT));
		serverChannel.accept(null, new AcceptHandler(serverChannel));
		Thread.sleep(5000);
	}
	public static void main(String[] args)throws Exception{
		AIOServer server = new AIOServer();
		server.startListen();
	}
}
class AcceptHandler implements CompletionHandler<AsynchronousSocketChannel, Object>{
	private AsynchronousServerSocketChannel serverChannel;
	public AcceptHandler(AsynchronousServerSocketChannel sc){
		this.serverChannel = sc;
	}
	ByteBuffer buff = ByteBuffer.allocate(1024);
	@Override
	public void completed(final AsynchronousSocketChannel sc, Object attachment){
		AIOServer.channelList.add(sc);
		serverChannel.accept(null , this);
		sc.read(buff , null, new CompletionHandler<Integer,Object>(){
			@Override
			public void completed(Integer result, Object attachment){
				buff.flip();
				String content = StandardCharsets.UTF_8.decode(buff).toString();
				for(AsynchronousSocketChannel c : AIOServer.channelList){
					try{
						c.write(ByteBuffer.wrap(content.getBytes(AIOServer.UTF_8))).get();
					}
					catch (Exception ex){
						ex.printStackTrace();
					}
				}
				buff.clear();
				sc.read(buff , null , this);
			}
			@Override
			public void failed(Throwable ex, Object attachment){
				System.out.println("读取数据失败: " + ex);
				AIOServer.channelList.remove(sc);
			}
		});
	}
	@Override
	public void failed(Throwable ex, Object attachment){
		System.out.println("连接失败: " + ex);
	}
}