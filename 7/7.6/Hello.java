
import java.util.*;

public class Hello
{
	public static void main(String[] args)
	{
		// ȡ��ϵͳĬ�ϵĹ���/���Ի���
		Locale myLocale = Locale.getDefault(Locale.Category.FORMAT);
		// ����ָ������/���Ի���������Դ�ļ�
		ResourceBundle bundle = ResourceBundle
			.getBundle("mess" , myLocale);
		// ��ӡ����Դ�ļ���ȡ�õ���Ϣ
		System.out.println(bundle.getString("hello"));
	}
}
