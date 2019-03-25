public class AuctionTest{
	private double initPrice=10.0;
	public void bid(String bidPrice)throws AuctionException{
		double d=0.0;
		try{
			d=Double.parseDouble(bidPrice);
		}
		catch(Exception e){
			e.printStackTrace();
			throw new AuctionException("���ļ۱�������ֵ��"
				+ "���ܰ��������ַ���");
		}
		if(initPrice>d){
			throw new AuctionException("���ļ۱����ļ۵ͣ�"
				+ "�������ģ�");
		}
		initPrice=d;
	}
	public static void main(String[] args){
		AuctionTest at=new AuctionTest();
		try{
			at.bid("df");
		}
		catch(AuctionException ae){
			System.out.println(ae.getMessage());
		}
	}
}