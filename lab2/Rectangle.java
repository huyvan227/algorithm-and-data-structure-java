public class Rectangle{
	private float length;
	private float width;
	
	public Rectangle(){
		this.length = 1.0f;
		this.width = 1.0f;
	}
	
	public Rectangle(float length, float width){
		this.length = (float)length;
		this.width = (float)width;
	}
	public float getLength(){
		return this.length;
	}
	public void setLength(float length){
		this.length = (float)length;
	}
	public float getWidth(){
		return this.width;
	}
	public void setWidth(float Width){
		this.width = (float)width;
	}
	public double getArea(){
		return (double)this.length*this.width;
	}
	public double getPerimeter(){
		return (double)(this.length + this.width)*2;
	}
	@Override
	public String toString(){
		return "Rectangle[length = " +this.length+ ",width= "+this.width+"]";
	}
}