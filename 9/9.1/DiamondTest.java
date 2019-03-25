import java.util.*;
public class DiamondTest{
	public static void main(String[] args){
		List<String> slist=new ArrayList<>();
		slist.add("123");
		slist.add("456");
		slist.forEach(ele->System.out.println(ele+" "+ele.length()));

	}
}