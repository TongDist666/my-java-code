public class CommendTest{
	public static void main(String[] args){
	ProcessArray pa=new ProcessArray();
	int[] target={1,2,3,4,5,6};
	pa.process(target,new PrintCommand());
	System.out.println("------");
	pa.process(target,new AddCommand());
	}
}