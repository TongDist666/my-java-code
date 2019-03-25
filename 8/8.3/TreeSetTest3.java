import java.util.*;
class R implements Comparable{
	int count;
	public R(int count){
		this.count=count;
	}
	public String toString(){
		return "R=["+count+"]";
	}
	public boolean equal(Object ob){
		if(this==ob) return true;
		if(ob!=null&&ob.getClass()==R.class){
			R r=(R)ob;
			return r.count==this.count;
		}
		return false;
	}
	public int compareTo(Object ob){
		R r=(R)ob;
		return count<r.count?-1:count>r.count?1:0;
	}
}
public class TreeSetTest3{
	public static void main(String[] args){
		TreeSet t=new TreeSet();
		t.add(new R(5));
		t.add(new R(-3));
		t.add(new R(9));
		t.add(new R(-2));

		System.out.println(t);

		R first=(R)t.first();
		first.count=20;
		R last=(R)t.last();
		last.count=-2;

		System.out.println(t);
		System.out.println(t.remove(new R(-2)));
		System.out.println(t);
		System.out.println(t.remove(new R(5)));
		System.out.println(t);
		System.out.println(t.remove(new R(-2)));
		System.out.println(t);
	}
}