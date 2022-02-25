import java.util.Scanner;
public class Homework1{
	public static int findFirstDigits(int a){
		while(a>=10)
		{
			a = a/10;
		}
		return a;
	}
	public static int findLastDigits(int a){
		int b = (a%10);
		return b;
	}
	public static void findSum(int a){
		int sum=0;
		while(a>0)
		{
			
			sum = sum + a%10;
			a = a/10;
		}
		System.out.println("Sum of digits : " +sum);
	}
	public static void findPro(int a){
		int pro=1;
		while(a>0)
		{
			
			pro = pro *(a%10);
			a = a/10;
		}
		System.out.println("Product of digits : " +pro);
	}
	public static int countNum(int a){
		int count=0;
		while(a>0)
		{
			a = a/10;
			count = count + 1;
		}
		return count;
	}
	public static void swapDigits(int a){
		int firstdigits = findFirstDigits(a);
		int lastdigits = findLastDigits(a);
		int digit = countNum(a)-1;
		int swapnum ;
		swapnum = lastdigits;
		swapnum = swapnum*(int)(Math.pow(10,digit));
		swapnum = swapnum + a%(int)(Math.pow(10,digit));
		swapnum = swapnum - lastdigits;
		swapnum = swapnum + firstdigits;
		System.out.println("Number after swapping: " + swapnum);
	}
	public static void reverseNum(int a){
		int b = countNum(a)-1,c,revnum=0;
		while(a>0)
		{
			c=a%10;
			revnum= revnum + c*(int)Math.pow(10,b);
			b=b-1;
			a=a/10;
		}
		System.out.println("Reverse Number: " +revnum);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number to find digit: ");
		int a = sc.nextInt();
		System.out.println("First digit: " +findFirstDigits(a));
		System.out.println("Last digit: " +findLastDigits(a));
		System.out.print("Enter any number to find Sum of digits: ");
		int b = sc.nextInt();
		findSum(b);
		System.out.print("Enter any number to find Product of digits: ");
		int c = sc.nextInt();
		findPro(c);
		System.out.print("Enter any number to count digits : ");
		int d = sc.nextInt();
		System.out.println("Number of digits: " +countNum(d));
		System.out.print("Enter number to swap: ");
		int e = sc.nextInt();
		swapDigits(e);
		System.out.print("Enter number to reverse: ");
		int f = sc.nextInt();
		reverseNum(f);
	}
}