public class Cylinder extends Circle{
	protected double height;
	
	public Cylinder(){
		super();
		this.height = 1.0;
	}
	public Cylinder(double radius){
		super(radius);
		this.height = 1.0;
	}
	
	public Cylinder(double radius, double height){
		super(radius);
		this.height = height;
	}
	
	public Cylinder(double radius, double height, String color){
		super(radius,color);
		this.height = height;
	}
	
	public double getHeight(){
		return height;
	}
	public void setHeigt(double height){
		this.height = height;
	}
	public double getVolume(){
		return 3.14*radius*radius*height;
	}
}