import java.util.*;
public class A<T>{
	private T info;
	public A(){}
	public A(T info){
		this.info=info;
	}
	public void setInfo(T info){
		this.info=info;
	}
	public T getInfo(){
		return this.info;
	}
	public static void main(String[] args){
		A<String> a1=new A<>("123");
		System.out.println(a1.getInfo());
		System.out.println(a1.getInfo().getClass());


		A<Integer> a2=new A<>(3);
		System.out.println(a2.getInfo());
		System.out.println(a2.getInfo().getClass());
	}
}