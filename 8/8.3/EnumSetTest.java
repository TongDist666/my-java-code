import java.util.*;
enum Season{
	Spring,Summer,Fall,Winter
}
public class EnumSetTest{
	public static void main(String[] args){
		EnumSet e1=EnumSet.allOf(Season.class);
		System.out.println(e1);
		EnumSet e2=EnumSet.noneOf(Season.class);
		System.out.println(e2);

		e2.add(Season.Winter);
		e2.add(Season.Summer);
		System.out.println(e2);

		EnumSet e3=EnumSet.of(Season.Winter,Season.Summer);
		System.out.println(e3);

		EnumSet e4=EnumSet.range(Season.Summer,Season.Winter);
		System.out.println(e4);

	}
}