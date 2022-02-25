public class Test{
	public static void main(String[] args){
		Movable a = new MovablePoint(4,4,2,1);
		System.out.println(a);
		a.moveDown();
		a.moveLeft();
		System.out.println(a);
		a = new MovableCircle(5,5,3,2,10);
		System.out.println(a);
		a.moveDown();
		a.moveLeft();
		System.out.println(a);
		
	}
}