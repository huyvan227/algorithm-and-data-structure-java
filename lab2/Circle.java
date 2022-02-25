public class Circle{
	private String color;
	private double radius;
	
	public Circle(){
		this.color = "red";
		this.radius = 1.0;
	}
	
	public Circle(double r){
		this.radius = r; 
	}
	
	public double getRadius(){
		return this.radius;
	}
	
	public  double getArea(){
		return this.radius * this.radius * 3.14;
	}
}
