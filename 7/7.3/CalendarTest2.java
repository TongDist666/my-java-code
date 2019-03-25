import java.util.*;
import static java.util.Calendar.*;
public class CalendarTest2{
	public static void main(String[] args){
		Calendar c=Calendar.getInstance();
		Calendar d=Calendar.getInstance();
		System.out.println(c.get(YEAR));
		System.out.println(c.get(MONTH));
		System.out.println(c.get(DATE));

		c.set(2018,7,31);
		System.out.println(c.getTime());
		c.set(MONTH,8);
		System.out.println(c.getTime());
		c.set(DATE,5);
		System.out.println(c.getTime());

		d.set(2018,7,31);
		System.out.println(d.getTime());
		d.set(MONTH,8);
		//System.out.println(d.getTime());
		d.set(DATE,5);
		System.out.println(d.getTime());
	}
}