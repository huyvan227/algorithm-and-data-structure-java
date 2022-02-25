public class Test{
	public static void main(String[] args){
		Shape s = new Rectangle("white",false,3,4);
		System.out.println(s.toString());
		System.out.println("Area = " + s.getArea());
		System.out.println(s);
		Square a = new Square("black",true,4);
		System.out.println(a.toString());
		a.setWidth(5);
		System.out.println("Area = " + a.getPerimeter());
		
	}
}