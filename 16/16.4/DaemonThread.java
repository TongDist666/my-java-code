public class DaemonThread extends Thread{
	public DaemonThread(String name){
		super(name);
	}
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println(getName()+" "+i);
		}
	}
	public static void main(String[] args){
		DaemonThread dt=new DaemonThread("Daemon");
		dt.setDaemon(true);
		dt.start();
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}