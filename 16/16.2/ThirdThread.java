import java.util.concurrent.*;
public class ThirdThread{
	public static void main(String[] args){
		ThirdThread tt=new ThirdThread();
		FutureTask<Integer> task=new FutureTask<Integer>((Callable<Integer>)()->{
			int i=0;
			for(;i<100;i++){
				System.out.println(Thread.currentThread().getName()+"��ѭ������i:"+i);
			}
			return i;
		});
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"��ѭ������i:"+i);
			if(i==20){
				new Thread(task,"������ֵ���߳�").start();
			}
		}
		try{
			System.out.println("���̵߳ķ���ֵ"+task.get());
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}