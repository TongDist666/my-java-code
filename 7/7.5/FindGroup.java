import java.util.regex.*;
public class FindGroup{
	public static void main(String[] args){
		String s="123¹ş¹ş¹ş654¹ş¹ş¹ş789¹ö¹ö¹ö";
		Matcher m=Pattern.compile("(\\d{3})").matcher(s);//³öÏÖ3¸öÊı×Ö
		while(m.find()) System.out.println(m.group());
	}
}