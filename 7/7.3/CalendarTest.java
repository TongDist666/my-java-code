import java.util.*;
import static java.util.Calendar.*;
public class CalendarTest{
	public static void main(String[] args){
		Calendar c=Calendar.getInstance();
		System.out.println(c.get(YEAR));
		System.out.println(c.get(MONTH));
		System.out.println(c.get(DATE));

		c.set(2018,10,23,12,32,23);
		System.out.println(c.getTime());

	}
}