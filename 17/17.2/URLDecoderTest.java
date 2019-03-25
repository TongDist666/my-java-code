import java.net.*;
public class URLDecoderTest{
	public static void main(String[] args)throws Exception{
		String keyWord=URLDecoder.decode("%E7%96%AF%E7%8B%82JAVA","utf-8");
		System.out.println(keyWord);

		String urlStr=URLEncoder.encode("·è¿ñAndroid½²Òå","GBK");
		System.out.println(urlStr);
	}
}