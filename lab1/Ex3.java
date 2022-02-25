import java.util.Scanner;
public class Ex3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap chieu dai: ");
		float a = sc.nextFloat();
		System.out.print("nhap chieu rong: ");
		float b = sc.nextFloat();
		float peri = (a+b)*2;
		float area = a*b;
		System.out.println("perimeter: " + peri);
		System.out.println("area: " + area);
	}
}
		