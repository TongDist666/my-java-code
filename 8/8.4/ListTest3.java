import java.util.*;
public class ListTest3{
	public static void main(String[] args){
		List books=new ArrayList();
		books.add("123");
		books.add("2345");
		books.add("456789");
		books.add("34567");
		
		System.out.println(books);

		books.sort((o1,o2)->((String)o1).length()-((String)o2).length());
		System.out.println(books);

		books.replaceAll(ele->((String)ele).length());
		System.out.println(books);
	}
}