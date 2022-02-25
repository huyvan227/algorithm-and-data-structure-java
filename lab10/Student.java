public class Student{
	private String name;
	private double mathematics;
	private double programming;
	private double DSA1;
	
	public Student(){
		this.name = " ";
		this.mathematics = 0;
		this.programming = 0;
		this.DSA1 = 0;
	}
	public Student(String name, double mathematics, double programming, double DSA){
		this.name = name;
		this.mathematics = mathematics;
		this.programming = programming;
		this.DSA1 = DSA1;
	}
	public double avg(){
		return (this.mathematics+this.mathematics+this.DSA1)/3;
	}
	@Override
	public String toString(){
		return this.name +" " + this.avg();
	}
}