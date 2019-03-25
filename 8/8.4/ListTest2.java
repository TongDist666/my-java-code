import java.util.*;
class A{
	public boolean equals(Object ob){
		return true;
	}
}
public class ListTest2{
	public static void main(String[] args){
		List books=new ArrayList();
		books.add(new String("123"));
		books.add(new String("456"));
		books.add(new String("789"));

		System.out.println(books);
		books.remove(new A());
		System.out.println(books);
		books.remove(new A());
		System.out.println(books);
	}
}