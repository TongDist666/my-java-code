import java.util.concurrent.ThreadLocalRandom ;
public class ThreadLocalRandomTest{
	public static void main(String[] args){
		ThreadLocalRandom r=ThreadLocalRandom.current();
		System.out.println(r.nextInt(1,10));
	}
}