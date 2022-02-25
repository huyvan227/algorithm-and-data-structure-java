import java.util.Scanner;
import java.lang.Math;
public class Ex6_11
{
	public static void findAbs(float a){
		System.out.println("Absolute of " +a+ " is " +Math.abs(a));
		
	}
	public static void checkLeapYear(int year){
		boolean leap = false;
		if(year % 4 == 0)
		{
			if(year%100 == 0)
			{
				if(year%400 == 0)
				{
					leap = true;
				}
				else
				{
					leap = false;
				}
			}
			else 
			{
				leap = true;
			}
		}
		else
		{
			leap = false;
		}
		if(leap)
		{
			System.out.println(year + " is a leap year");
		}
		else
		{
			System.out.println(year + " isn't a leap year");
		}
	}
	public static void findMaxOf2(float a, float b){
		if(a>b)
		{
			System.out.println("max number is : " +a);
		}
		else if(a==b)
		{
			System.out.println("2 number are equal");
		}
		else
		{
			System.out.println("max number is : " +b);
		}
	}
	public static void findMaxOf3(float a, float b,float c){
		if(a>b && a>c)
		{
			System.out.println("max number is : " +a);
		}
		else if(b>a && b>c)
		{
			System.out.println("max number is : " +b);
		}
		else if(c>a && c>b)
		{
			System.out.println("max number is : " +c);
		}
		else
		{
			System.out.println("the numbers are not distinct");
		}
	}
	public static void checkEven(float a){
		if(a%2 == 0)
		{
			System.out.println(a+ " is even");
		}
		else
		{
			System.out.println(a+ " isn't even");
		}
	}
	public static void checkCharacter(char a){
		if((a >= 'a' && a <= 'z')|| (a >= 'A' && a <= 'Z'))
		{
			System.out.println(a+ " is  alphanumeric");
		}
		else
		{
			System.out.println(a+ " is not  alphanumeric");
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to find absolute: ");
		float a = sc.nextFloat();
		findAbs(a);
		System.out.print("Enter a year to check if it a leap year or not: ");
		int b = sc.nextInt();
		checkLeapYear(b);
		System.out.print("Enter 2 number to find max: ");
		float c = sc.nextFloat();
		float d = sc.nextFloat();
		findMaxOf2(c,d);
		System.out.print("Enter 3 number to find max: ");
		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		float num3 = sc.nextFloat();
		findMaxOf3(num1,num2,num3);
		System.out.print("Enter a number to check if even: ");
		float e = sc.nextFloat();
		checkEven(e);
		System.out.print("Enter a character: ");
		char f = sc.next().charAt(0);
		checkCharacter(f);
		

	}
}