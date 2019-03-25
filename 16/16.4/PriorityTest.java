public class PriorityTest extends Thread{
	public PriorityTest(String name){
		super(name);
	}
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(getName()+":���ȼ��ǣ�"+getPriority()+",ѭ��������ֵ�ǣ�"+i);
		}
	}
	public static void main(String[] args){
		Thread.currentThread().setPriority(6);
		for(int i=0;i<30;i++){
			if(i==10){
				PriorityTest low=new PriorityTest("low");
				low.start();
				System.out.println("LOW����֮�������ȼ���"+low.getPriority());
				low.setPriority(Thread.MIN_PRIORITY);
			}
			if(i==20){
				PriorityTest high=new PriorityTest("high");
				high.start();
				System.out.println("HIGH����֮�������ȼ���"+high.getPriority());
				high.setPriority(Thread.MAX_PRIORITY);
			}
		}
	}
}