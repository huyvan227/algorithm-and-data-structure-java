public class Rectangle extends Shape{
	protected double width;
	protected double length;
	
	public Rectangle(){
		super();
		this.width = 0;
		this.length = 0;
	}
	
	public Rectangle(double width, double length){
		super();
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(String color, boolean filled, double width, double length){
		super(color,filled);
		this.width = width;
		this.length = length;
	}
	
	public double getWidth(){
		return width;
	}
	public void setWidth(double width){
		this.width = width;
	}
	
	public double getlength(){
		return length;
	}
	public void setLength(double length){
		this.length = length;
	}
	@Override
	public double getArea(){
		return this.width*this.length;
	}
	@Override
	public double getPerimeter(){
		return (this.width + this.length)*2;
	}
	@Override
	public String toString(){
		return "Rectangle: " +super.toString()+ " width :" +width+ " length: " +length;
	}
}