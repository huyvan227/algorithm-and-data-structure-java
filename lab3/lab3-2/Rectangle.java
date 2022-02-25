public class Rectangle extends Shape{
	protected double width;
	protected double length;
	
	public Rectangle(){
		this.width = 1;
		this.length = 1;
	}
	
	public Rectangle(double width, double length){
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
	public double getArea(){
		return width*length;
	}
	public double getPerimeter(){
		return (width+length)*2;
	}
	@Override
	public String toString(){
		return "Rectangle[" +super.toString()+" width: "+width+ " length: "+length;
	}
}