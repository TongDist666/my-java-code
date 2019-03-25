import java.util.*;
public class SeedTest{
	public static void main(String[] args){
		Random r1=new Random(3);
		Random r3=new Random(3);
		Random r2=new Random(6);

		System.out.println(r1.nextBoolean());
		System.out.println(r1.nextInt());
		System.out.println(r1.nextFloat());
		System.out.println(r1.nextDouble());

		System.out.println(r2.nextBoolean());
		System.out.println(r2.nextInt());
		System.out.println(r2.nextFloat());
		System.out.println(r2.nextDouble());
		
		System.out.println(r3.nextBoolean());
		System.out.println(r3.nextInt());
		System.out.println(r3.nextFloat());
		System.out.println(r3.nextDouble());

		System.out.println(r3.nextFloat());
		System.out.println(r3.nextDouble());
		System.out.println(r3.nextBoolean());
		System.out.println(r3.nextInt());

	}
}