public class RegularPolygon{
	protected String name;
	protected int sideAmount;
	protected double sideLength;
	protected String color;
	protected static int quantity=0;
	
	public RegularPolygon(){
		name = "";
		sideAmount = 3;
		sideLength = 1;
		color = "red";
		quantity++;
	}
	public RegularPolygon(String name,int sideAmount,double sideLength,String color){
		this.name = name;
		this.sideAmount = sideAmount;
		this.sideLength = sideLength;
		this.color = color;
		quantity++;
	}
	public RegularPolygon(String name, int sideAmount){
		this.name = name;
		this.sideAmount = sideAmount;
		sideLength = 1;
		color = "red";
		quantity++;
	}
	public RegularPolygon(RegularPolygon rp){
		this.name = rp.name;
		this.sideAmount = rp.sideAmount;
		this.sideLength = rp.sideLength;
		this.color = rp.color;
		quantity++;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setSideAmount(int sideamount){
		this.sideAmount = sideamount;
	}
	public void setSideLength(double sidelength){
		this.sideLength = sidelength;
	}
	public void setColor(String color){
		this.color = color;
	}
	public static int getQuantity(){
		return quantity;
	}
	public String getName(){
		return this.name;
	}
	public int getSideAmount(){
		return this.sideAmount;
	}
	public double getSideLength(){
		return this.sideLength;
	}
	public String getColor(){
		return this.color;
	}
	public String getPolygon(){
		int side1 = this.getSideAmount();
		String a ="" ;
		if (side1 == 3){
			a = "Hinh Tam Giac";
		}
		if (side1 == 4){
			a =  "Hinh Tu Giac";
		}
		if (side1 == 5){
			a = "Hinh Ngu Giac";
		}
		if (side1 == 6){
			a =  "Hinh Luc Giac";
		}
		if (side1 > 6){
			a =  "Hinh Da Giac Co Hon 6 Canh";
		}
		return a;
	}
	public double parameter(){
		return this.getSideAmount()*this.getSideLength();
	}
	public double area(){
		double length;
		int side;
		double result = 0;
		length = this.getSideLength();
		side = this.getSideAmount();
		if (side == 3){
			result = (length*length)*0.433;
		}
		if (side == 4){
			result = (length*length)*1;
		}
		if (side == 5){
			result = (length*length)*1.72;
		}
		if (side == 6){
			result = (length*length)*2.598;
		}
		if (side > 6){
			result = -1;
		}
		return result;

	}
	@Override
	public boolean equals(Object obj){
		if(obj instanceof RegularPolygon){
			RegularPolygon polygon = (RegularPolygon) obj;
			if(this.getSideAmount() == polygon.getSideAmount() && this.getSideLength() == polygon.getSideLength() && this.getColor().equals(polygon.getColor()) ){
				return true;
			}
			else if(this.getColor() == null || polygon.getColor() == null){
				return false;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}

	
	
	
	
	
	
	
}