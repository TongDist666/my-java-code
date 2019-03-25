public class Apple{
	public String name;
	public String color;
	public double weight;
	public Apple(){}
	public Apple(String name,String color){
		this.name=name;
		this.color=color;
	}
	public Apple(String name,String color,double weight){
		this(name,color);
		this.weight=weight;
	}
	public static void main(String[] args){
	Apple a=new Apple();
	System.out.println("Apple.name="+a.name+"\nApple.color="+a.color+"\nApple.weight="+a.weight);
	Apple b=new Apple("name1","color1");
	System.out.println("Apple.name="+b.name+"\nApple.color="+b.color+"\nApple.weight="+b.weight);
	Apple c=new Apple("name2","color2",1.23);
	System.out.println("Apple.name="+c.name+"\nApple.color="+c.color+"\nApple.weight="+c.weight);
	}
}