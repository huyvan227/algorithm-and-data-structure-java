public class Point2D{
	protected float x;
	protected float y;
	
	public Point2D(){
		this.x = 0;
		this.y = 0;
	}
	
	public Point2D(float x, float y){
		this.x = x;
		this.y = y;
	}
	
	public float getX(){
		return x;
	}
	public void setX(float x){
		this.x = x;
	}
	
	public float getY(){
		return y;
	}
	public void setY(float y){
		this.y = y;
	}
	
	public void setXY(float x, float y){
		this.x = x;
		this.y = y;
		
	}
	public float[] getXY(){
		float[] a = new float[2];
		a[0] = x;
		a[1] = y;
		return a;
	}
	
	@Override
	public String toString(){
		return "(x: "+x+ " y: "+y+")";
	}
}