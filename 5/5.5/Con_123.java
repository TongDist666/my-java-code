public class Con_123{
	public String name;
	public int age;
	public Con_123(String name,int age){
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args){
		Con_123 c=new Con_123("mingzi",36);
		System.out.println("name:"+c.name+"\nage:"+c.age);
	}

}