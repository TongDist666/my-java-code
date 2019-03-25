class MyThread extends Thread{
	public MyThread(String name){
		super(name);
	}
	public MyThread(ThreadGroup group,String name){
		super(group,name);
	}
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println(getName()+"�̵߳ı���i��"+i);
		}
	}
}
public class ThreadGroupTest{
	public static void main(String[] args){
		ThreadGroup mainGroup=Thread.currentThread().getThreadGroup();
		System.out.println("���߳�������֣�"+mainGroup.getName());
		System.out.println("���߳����Ƿ��Ǻ�̨�߳��飿"+mainGroup.isDaemon());

		new Thread("���߳�����߳�").start();
		ThreadGroup tg=new ThreadGroup("���߳���");
		tg.setDaemon(true);
		System.out.println("tg�߳����Ƿ��Ǻ�̨�߳��飿"+tg.isDaemon());

		MyThread tt=new MyThread(tg,"tg����̼߳�");
		tt.start();
		new MyThread(tg,"tg����߳���").start();
	}
}