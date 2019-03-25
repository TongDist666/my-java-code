import java.util.*;
public class CollectionEach{
	public static void main(String[] arg){
		Collection c=new HashSet();
		c.add("ha1");
		c.add("ha2");
		c.add("ha3");
		c.forEach(obj->System.out.println(obj));
	}
}