public class FinalizedEscapeGc{
	public static FinalizedEscapeGc SAVE_HOOK=null;
	public void isAlive(){
		System.out.println("yes,i am alive!");
	}
	@Override
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println("finalize method is running!");
		FinalizedEscapeGc.SAVE_HOOK=this;
	}
	public static void main(String[] args) throws Throwable{
		SAVE_HOOK=new FinalizedEscapeGc();

		SAVE_HOOK=null;
		System.gc();
		Thread.sleep(500);
		if(SAVE_HOOK!=null){
			SAVE_HOOK.isAlive();
		}
		else{
			System.out.println("i am dead!");
		}

		
	}
}