import java.lang.Math;
public class MathTest{
	public static void main(String[] args){
		

		System.out.println(Math.pow(3.2,5));//3.2的5次方
		System.out.println(Math.sqrt(2));//2的平方根
		System.out.println(Math.random());//产生随机数（0~1）
		System.out.println(Math.sin(3.14));//此处3.14被当成弧度值
		int a=5;
		int b=4;
		int c=(a++) - --b * ++a / b-- >> 2 % a--;
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
	}
}