import java.util.*;

public class LinkedHashSetTest{
	public static void main(String[] args){
		LinkedHashSet books=new LinkedHashSet();
		books.add("123");
		books.add("456");
		System.out.println(books);

		books.remove("123");
		books.add("789");
		System.out.println(books);
	}
}