public class Varags{
	public static void test(int a,String... books){//接受多个参数
		for(String book:books){
			System.out.println(book);
		}
		System.out.println(a);
	}
	public static void main(String[] args){
		test(3,"qwe","asd");
	}
}