public class Point3D extends Point2D{
	protected float z;
	
	public Point3D(){
		super();
		this.z = 0;
	}
	public Point3D(float x, float y, float z){
		super(x,y);
		this.z = z;
	}
	
	public float getZ(){
		return z;
	}
	public void setZ(float z){
		this.z = z;
	}
	public void setXYZ(float x, float y, float z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public float[] getXYZ(){
		float[] a = new float[3];
		a[0] = x;
		a[1] = y;
		a[2] = z;
		return a;
	}
	@Override
	public String toString(){
		return "(x: "+x+ " y: "+y+ " z: " +z+ ")" ;
	}
}