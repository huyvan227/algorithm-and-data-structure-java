import java.util.Scanner;
public class Ex13{
	public static void checkGrade(float a, float b, float c, float d, float e){
		float per = (a + b + c + d + e)/5f ;
		System.out.println("percentage: " +per);
		if(per > 90)
		{
			System.out.println("Grade A");
		}
		else if(per>80)
		{
			System.out.println("Grade B");
		}
		else if(per>70)
		{
			System.out.println("Grade C");
		}
		else if(per>60)
		{
			System.out.println("Grade D");
		}
		else if(per>40)
		{
			System.out.println("Grade E");
		}
		else
		{
			System.out.println("Grade F");
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter mark of Physics: ");
		float phy = sc.nextFloat();
		System.out.print("Enter mark of Chemistry: ");
		float chemis = sc.nextFloat();
		System.out.print("Enter mark of Biology: ");
		float bio = sc.nextFloat();
		System.out.print("Enter mark of Mathematics: ");
		float math = sc.nextFloat();
		System.out.print("Enter mark of Computers: ");
		float comp = sc.nextFloat();
		checkGrade(phy,chemis,bio,math,comp);
	}	

	
}