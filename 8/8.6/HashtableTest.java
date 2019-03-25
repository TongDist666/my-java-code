import java.util.*;
class A{
	int count;
	public A(int count){
		this.count=count;
	}
	public boolean equals(Object o){
		if(o==this) return true;
		if(o!=this&&o.getClass()==A.class){
			A a=(A)o;
			return this.count==a.count;
		}
		return false;
	}
	public int hashCode(){
		return this.count;
	}
}
class  B{
	public boolean equals(Object o){
		return true;
	}
}
public class HashtableTest{
	public static void main(String[] args){
		Hashtable h=new Hashtable();
		h.put(new A(123),"hhh123");
		h.put(new A(456),"hhh456");
		h.put(new A(789),new B());
		System.out.println(h);
		System.out.println(h.containsValue("ggg"));
		System.out.println(h.containsKey(new A(456)));
		h.remove(new A(789));
		System.out.println(h);
	}
}