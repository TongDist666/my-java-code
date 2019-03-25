import java.util.*;
public class MapTest{
	public static void main(String[] args){
		Map m=new HashMap();
		m.put("ha",1);
		m.put("ah",2);
		m.put("hh",3);
		System.out.println(m);
		System.out.println(m.put("ah",4));
		System.out.println(m.containsKey("ah"));
		System.out.println(m.containsValue(2));
		for(Object o:m.keySet()) System.out.println(o+"-->"+m.get(o));

		m.remove("ah");
		System.out.println(m);

	}
}