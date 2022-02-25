public class Circle extends Shape{
	protected double radius;
	
	public Circle(){
		super();
		this.radius = 1;
	}
	
	public Circle(double radius ){
		super();
		this.radius = radius;
	}
	
	public Circle(String color, boolean filled, double radius){
		super(color, filled);
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	public double getArea(){
		return 3.14*radius*radius;
	}
	public double getPerimeter(){
		return 3.14*radius*2;
	}
	@Override
	public String toString(){
		return "Circle[Radius: " +radius+ " " +super.toString()+"]"; 
	}
}