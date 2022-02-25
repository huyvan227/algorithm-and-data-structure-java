import java.util.Scanner;
public class Ex5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Celsius: ");
		float c = sc.nextFloat();
		float f = (c*(9f/5)) + 32;
		System.out.println("Fahrenheit: " + f);
	}
}