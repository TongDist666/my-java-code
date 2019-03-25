class A{
	public synchronized void foo(B b){
		System.out.println("��ǰ�߳�����"+Thread.currentThread().getName()+"������A���foo����");
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println("��ǰ�߳�����"+Thread.currentThread().getName()+"��ͼ����B���last����");
		b.last();
	}
	public synchronized void last(){
		System.out.println("������A���last����");
	}
}
class B{
	public synchronized void bar(A a){
		System.out.println("��ǰ�߳�����"+Thread.currentThread().getName()+"������B���bar����");
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println("��ǰ�߳�����"+Thread.currentThread().getName()+"��ͼ����A���last����");
		a.last();
	}
	public synchronized void last(){
		System.out.println("������B���last����");
	}
}
public class DeadLock implements Runnable{
	A a=new A();
	B b=new B();
	public void init(){
		Thread.currentThread().setName("���߳�");
		a.foo(b);
		System.out.println("���������߳�֮��");
	}
	public void run(){
		Thread.currentThread().setName("���߳�");
		b.bar(a);
		System.out.println("�����˸��߳�֮��");
	}
	public static void main(String[] args){
		DeadLock dl=new DeadLock();
		new Thread(dl).start();
		dl.init();
	}
}