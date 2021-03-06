public class Square extends Rectangle{
	public Square(){
		super();
	}
	public Square(double side){
		super(side,side);
	}
	public Square(String color, boolean filled, double side){
		super(color,filled,side,side);
	}
	public double getSide(){
		return super.getWidth();
	}
	public void setSide(double side){
		super.setWidth(side);
		super.setLength(side);
	}
	@Override
	public void setWidth(double side){
		this.width = side;
		this.length = side;
	}
	@Override
	public void setLength(double side){
		this.width = side;
		this.length = side;
	}
	@Override
	public String toString(){
		return "Square[side "+this.width+" "+super.toString();
	}
}