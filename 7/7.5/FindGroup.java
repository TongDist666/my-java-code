import java.util.regex.*;
public class FindGroup{
	public static void main(String[] args){
		String s="123������654������789������";
		Matcher m=Pattern.compile("(\\d{3})").matcher(s);//����3������
		while(m.find()) System.out.println(m.group());
	}
}