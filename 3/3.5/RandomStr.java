import java.util.Random;
public class RandomStr{
	public static void main(String[] args){
		String result="";
		for(int i=0;i<6;i++){
			int v=(int)(Math.random()*26+97);
			result+=(char)v;
		}
		System.out.println(result);
	}
}