public class ResizableCircle extends Circle implements Resizable{
	public ResizableCircle(){
		super();
	}
	@Override
	public double resize(int percent){
		return this.radius + (this.radius*percent)/100;
	}
	@Override
	public String toString(){
		return "Circle[ "+super.toString();
	}
}