import java.util.*;
class Z implements Comparable{
	int age;
	public Z(int age){
		this.age=age;
	}
	public boolean equals(Object ob){
		return true;
	}
	public int compareTo(Object ob){
		return 1;
	}
}
public class TreeSetTest2{
	public static void main(String[] args){
		TreeSet s=new TreeSet();
		Z z1=new Z(3);
		s.add(z1);

		System.out.println(s.add(z1));
		((Z)(s.first())).age=9;
		System.out.println(((Z)(s.last())).age);
	}
}
