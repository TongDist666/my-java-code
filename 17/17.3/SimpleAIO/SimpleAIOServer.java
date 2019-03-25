import java.net.*;
import java.nio.*;
import java.nio.channels.*;
import java.util.concurrent.*;
public class SimpleAIOServer{
	static final int PORT =30000;
	public static void main(String[] args)throws Exception{
		try(AsynchronousServerSocketChannel serverChannel=AsynchronousServerSocketChannel.open()){
			serverChannel.bind(new InetSocketAddress(PORT));
			while(true){
				Future<AsynchronousSocketChannel> future=serverChannel.accept();
				AsynchronousSocketChannel socketChannel=future.get();
				socketChannel.write(ByteBuffer.wrap("欢迎来到AIO的世界！".getBytes("UTF-8"))).get();
			}
		}
	}
}