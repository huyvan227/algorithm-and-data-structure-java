public class Circle implements GeometricObject{
	protected double radius;
	
	public Circle(){
		this.radius = 1.0;
	}
	@Override
	public double getPerimeter(){
		return 2*radius*3.14;
	}
	@Override
	public double getArea(){
		return 3.14*radius*radius;
	}
	@Override
	public String toString(){
		return " Radius: " +radius;
	}
}