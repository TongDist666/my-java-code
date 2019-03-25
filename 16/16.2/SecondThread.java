public class SecondThread implements Runnable{
	private int i;
	public void run(){
		for(;i<100;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	public static void main(String[] args){
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
			if(i==20){
				SecondThread s=new SecondThread();
				new Thread(s,"1---   ").start();
				new Thread(s,"2---   ").start();
			}
		}
	}
}