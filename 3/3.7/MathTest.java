import java.lang.Math;
public class MathTest{
	public static void main(String[] args){
		

		System.out.println(Math.pow(3.2,5));//3.2��5�η�
		System.out.println(Math.sqrt(2));//2��ƽ����
		System.out.println(Math.random());//�����������0~1��
		System.out.println(Math.sin(3.14));//�˴�3.14�����ɻ���ֵ
		int a=5;
		int b=4;
		int c=(a++) - --b * ++a / b-- >> 2 % a--;
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
	}
}