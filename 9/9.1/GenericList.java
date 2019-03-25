import java.util.*;
public class GenericList{
	public static void main(String[] args){
		List<String> StrList=new ArrayList<>();
		StrList.add("123");
		StrList.add("456");
		StrList.forEach(str->System.out.println(str+str.length()));
	}
}