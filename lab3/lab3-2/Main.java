public class Main{
	public static void main(String[] args){
		Square a = new Square();
		Square b = new Square(3);
		Square c = new Square("blue",true,6);
		Shape d = new Shape();
		System.out.println("side: "+a.getWidth());
		a.setSide(4);
		System.out.println("side: "+a.getWidth());
		
		System.out.println("side: "+b.getWidth());
		b.setSide(10);
		System.out.println("side: "+b.getWidth());
		
		System.out.println("side: "+c.getWidth());
		c.setSide(7);
		System.out.println("side: "+c.getWidth());
		System.out.println("side: "+d.isFilled());
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	} 
}