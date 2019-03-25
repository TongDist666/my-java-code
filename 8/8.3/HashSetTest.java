import java.util.function.*;
import java.util.*;
class A{
		public boolean equals(Object ob){
			return true;
		}
	}
	class B{
		public int hashCode(){
			return 1;
		}
	}
	class C{
		public boolean equals(Object ob){
			return true;
		}
		public int hashCode(){
			return 2;
		}
	}
public class HashSetTest{
	
	public static void main(String[] args){
		HashSet h=new HashSet();
		h.add(new A());
		h.add(new A());
		h.add(new B());
		h.add(new B());
		h.add(new C());
		h.add(new C());
		System.out.println(h);
	}
}