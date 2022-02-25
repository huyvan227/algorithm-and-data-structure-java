public class Employee{
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee(int id, String firstName, String lastName, int salary){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getID(){
		return this.id;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public String getName(){
		return "First Name: " +this.firstName+ ",Last Name: "+this.lastName;
	}
	
	public int getSalary(){
		return this.salary;
	}
	
	public void setSalary(int salary){
		this.salary = salary;
	}
	
	public int getAnnualSalary(){
		return this.salary*12;
	}
	public float raiseSalary(float percent){
		return (this.salary*percent)/100 + this.salary;
	}
	@Override
	public String toString(){
		return "Employee[id= "+this.id+"Name: "+this.firstName+" "+this.lastName+",salary: "+this.salary+"]";
	}
}