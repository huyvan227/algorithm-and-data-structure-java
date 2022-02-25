import java.util.Scanner;
public class Ex2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap a: ");
		int a = sc.nextInt();
		System.out.print("nhap b: ");
		int b = sc.nextInt();
		int sum = a+b;
		int sub = a-b;
		int pro = a*b;
		float div = (float)a/b;
		int rem = a%b;
		System.out.println("a+b=" + sum);
		System.out.println("a-b=" + sub);
		System.out.println("a*b=" + pro);
		System.out.println("a/b=" + div);
		System.out.println("a%b=" + rem);
	}
}
		