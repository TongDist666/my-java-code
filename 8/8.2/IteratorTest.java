import java.util.*;
public class IteratorTest{
	public static void main(String[] args){
		Collection c=new HashSet();
		c.add("ha1");
		c.add("ha2");
		c.add("ha3");
		Iterator i=c.iterator();
		while(i.hasNext()){
			String s=(String)i.next();
			System.out.println(s);
			if(s.equals("ha2")) i.remove();
			s="123";
		}
		System.out.println(c);
	}
}