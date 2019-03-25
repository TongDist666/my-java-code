import java.util.Objects;
public class ObjectsTest{
	static ObjectsTest ob;
	public static void main(String[] args){
		System.out.println(Objects.hashCode(ob));
		System.out.println(Objects.toString(ob));
		System.out.println(Objects.requireNonNull(ob));
	}
}