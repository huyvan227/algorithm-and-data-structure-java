public class Test{
	public static void main(String[] args){
		Circle a = new Circle();
		Circle b = new Circle(2.5);
		System.out.println("Radius: " +a.getRadius());
		System.out.println("Area: " + b.getArea());
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(5,2);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println("Length: " +r1.getLength());
		System.out.println("Width: " + r1.getWidth());
		System.out.println("Length: " +r2.getLength());
		System.out.println("Width: " + r2.getWidth());
		System.out.println(r1.getArea());
		System.out.println(r1.getPerimeter());
		Employee n = new Employee(123,"A","nguyen",10000);
		System.out.println("ID: " +n.getID());
		System.out.println("First Name: " + n.getFirstName());
		System.out.println("Last Name: " + n.getLastName());
		System.out.println("salary: " + n.getSalary());
		n.setSalary(50000);
		System.out.println("new salary: " + n.getSalary());
		System.out.println("annual salary: " + n.getAnnualSalary());
		System.out.println("raised salary: " + n.raiseSalary(30));
		System.out.println(n);
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(4,6);
		System.out.println("add: " + f1.add(f2));
		System.out.println("sub: " + f1.subtract(f2));
		System.out.println("mul: " + f1.multiple(f2));
		System.out.println("div: " + f1.divide(f2));
		System.out.println("reduc: " + f2.reducer());
		
		
	}
}