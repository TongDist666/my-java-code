import java.util.concurrent.*;
public class ThirdThread{
	public static void main(String[] args){
		ThirdThread tt=new ThirdThread();
		FutureTask<Integer> task=new FutureTask<Integer>((Callable<Integer>)()->{
			int i=0;
			for(;i<100;i++){
				System.out.println(Thread.currentThread().getName()+"的循环变量i:"+i);
			}
			return i;
		});
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"的循环变量i:"+i);
			if(i==20){
				new Thread(task,"带返回值的线程").start();
			}
		}
		try{
			System.out.println("子线程的返回值"+task.get());
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}