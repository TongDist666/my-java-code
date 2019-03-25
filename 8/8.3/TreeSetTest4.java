import java.util.*;
class Rq {
	int count;
	public Rq(int count){
		this.count=count;
	}
	public String toString(){
		return "Rq=["+count+"]";
	}
}
public class TreeSetTest4{
	public static void main(String[] args){
		TreeSet t=new TreeSet((o1,o2)->{
			Rq r1=(Rq)o1;
			Rq r2=(Rq)o2;
			return r1.count>r2.count?-1:r1.count<r2.count?1:0;
		});
		t.add(new Rq(5));
		t.add(new Rq(-3));
		t.add(new Rq(9));
		t.add(new Rq(-2));

		System.out.println(t);
	}
}