public class PrismRPBased extends RegularPolygon{
	protected double height;
	
	public PrismRPBased(){
		super();
		this.height = 1;
	}
	public PrismRPBased(String name, int sideAmount, double sideLength,double height, String color){
		super(name,sideAmount,sideLength,color);
		this.height = height;
	}
	public PrismRPBased(String name, int sideAmount){
		super(name,sideAmount);
		this.height = 1;
	}public PrismRPBased(String name, int sideAmount, double height){
		super(name,sideAmount);
		this.height = height;
	}
	public double getHeight(){
		return this.height;
	}
	public void setHeight(double height){
		this.height = height;
	}
	public double getVolume(){
		return super.area()*this.height;
	}
	@Override
	public String toString(){
		return "[Da giac mat day:" +super.getPolygon()+ " ,Dien tich day: " +super.area()+ " ,The tich: "+getVolume();
	}
}