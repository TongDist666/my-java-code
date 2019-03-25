public class FloatTest{

	public static void main(String[] args){
		float a=5.2345556f;
		double b=0.0;
		double c=Double.NEGATIVE_INFINITY;
		float d=Float.NEGATIVE_INFINITY;
		System.out.println(a);
		System.out.println(c==d);//float和double的负无穷大相等
		System.out.println(b/b);//0/0出现非数
		System.out.println(  b/b==Float.NaN);//非数之间不等
		System.out.println(1.0/0==9.0/0);//正无穷大相等
		System.out.println(-9/0.0);//负数除以0.0得负无穷大
	}
}
