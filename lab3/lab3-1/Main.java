public class Main{
	public static void main(String[] args){
		
		Cylinder b = new Cylinder();
		System.out.println(b);
		Cylinder c = new Cylinder(3,4,"blue");
		System.out.println(c);
		Cylinder d = new Cylinder(4);
		System.out.println(d);
		Cylinder e = new Cylinder(7,9);
		System.out.println(e);
		System.out.println("1: " + b.getHeight());
		System.out.println("2: " + c.getHeight());
		System.out.println("3: " + d.getHeight());
		System.out.println("4: " + e.getRadius());
		System.out.println("5: " + c.getVolume());
		System.out.println("6: " + b.getVolume());
		
	} 
}