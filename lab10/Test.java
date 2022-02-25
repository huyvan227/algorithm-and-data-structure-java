import java.util.Arrays;
public class Test {
	 public static void print(Student[] arr){
		for(int i = 0; i<arr.length;i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
	Student[] student = new Student[5];
	student[0] = new Student("A",2,6,4);
	student[1] = new Student("B", 7,5,7);
	student[2] = new Student("C", 9,10,8);
	student[3] = new Student("D",6,6,6);
	student[4] = new Student("C", 7, 4 ,3);
	System.out.println("Original list of Student: ");
	print(student);
	System.out.println("list of Student in ascending order: ");
	Arrays.sort(student, new StudentComparator());
	print(student);
	System.out.println("list of Student in descending order: ");
	Arrays.sort(student, new StudentComparator2());
	print(student);
	}
}