class A{
	public synchronized void foo(B b){
		System.out.println("当前线程名："+Thread.currentThread().getName()+"进入了A类的foo方法");
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println("当前线程名："+Thread.currentThread().getName()+"企图进入B类的last方法");
		b.last();
	}
	public synchronized void last(){
		System.out.println("进入了A类的last方法");
	}
}
class B{
	public synchronized void bar(A a){
		System.out.println("当前线程名："+Thread.currentThread().getName()+"进入了B类的bar方法");
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println("当前线程名："+Thread.currentThread().getName()+"企图进入A类的last方法");
		a.last();
	}
	public synchronized void last(){
		System.out.println("进入了B类的last方法");
	}
}
public class DeadLock implements Runnable{
	A a=new A();
	B b=new B();
	public void init(){
		Thread.currentThread().setName("主线程");
		a.foo(b);
		System.out.println("进入了主线程之后");
	}
	public void run(){
		Thread.currentThread().setName("副线程");
		b.bar(a);
		System.out.println("进入了副线程之后");
	}
	public static void main(String[] args){
		DeadLock dl=new DeadLock();
		new Thread(dl).start();
		dl.init();
	}
}