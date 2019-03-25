import java.util.concurrent.*;
class Producer extends Thread{
	private BlockingQueue<String> bq;
	public Producer(BlockingQueue<String> bq){
		this.bq=bq;
	}
	public void run(){
		String[] strArr=new String[]{
			"JAVA",
			"Structs",
			"Spring"
		};
		for(int i=0;i<9;i++){
			System.out.println(getName()+"������׼����������Ԫ�أ�");
			try{
				Thread.sleep(200);
				bq.put(strArr[i%3]);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			System.out.println(getName()+"�����ɹ���"+bq);
		}
	}
}
class Consumer extends Thread{
	private BlockingQueue<String> bq;
	public Consumer(BlockingQueue<String> bq){
		this.bq=bq;
	}
	public void run(){
		while(true){
			System.out.println(getName()+"������׼������Ԫ�أ�");
			try{
				Thread.sleep(200);
				bq.take();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			System.out.println(getName()+"������ɣ�"+bq);
		}
	}
}
public class BlockingQueueTest2{
	public static void main(String[] args){
		BlockingQueue<String> bq=new ArrayBlockingQueue<>(1);

		new Producer(bq).start();
		new Producer(bq).start();
		new Producer(bq).start();

		new Consumer(bq).start();
	}
}