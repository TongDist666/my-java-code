public class FirstThread extends Thread{
	private int i;
	
	public void run(){
		for(;i<100;i++){
			System.out.println("当前线程名："+getName()+" "+i);
		}
	}
	public static void main(String[] args){
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
			if(i==20){
				//Thread.sleep(1);
				new FirstThread().start();
				new FirstThread().start();
			}
		}
	}
}
