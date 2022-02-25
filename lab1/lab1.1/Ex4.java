import java.util.Scanner;
public class Ex4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int days, years, weeks;
		System.out.print("Enter day: ");
		int a = sc.nextInt();
		years = a/365;
		weeks = (a % 365)/7;
		days = a - ((years*365) + (weeks*7));
		System.out.println("Years: " + years);
		System.out.println("Weeks: " + weeks);
		System.out.println("Days: " + days);
	}
}