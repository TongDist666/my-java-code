
import java.util.*;

public class IteratorEach
{
	public static void main(String[] args)
	{
		Collection books = new HashSet();
		books.add("轻量级Java EE企业应用实战");
		books.add("疯狂Java讲义");
		books.add("疯狂Android讲义");
		// 获取books集合对应的迭代器
		Iterator it = books.iterator();
		// 使用Lambda表达式（目标类型是Comsumer）来遍历集合元素
		it.forEachRemaining(obj -> System.out.println("迭代集合元素：" + obj));
	}
}
