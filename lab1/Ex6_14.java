import java.util.Scanner;
import java.lang.Math;
public class Ex6_14{
	//1
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
	//2
	public static void findSum(int a){
		int sum=0;
		while(a>0)
		{
			
			sum = sum + a%10;
			a = a/10;
		}
		System.out.println("Sum of digits : " +sum);
	}
	//3
	public static void findPro(int a){
		int pro=1;
		while(a>0)
		{
			
			pro = pro *(a%10);
			a = a/10;
		}
		System.out.println("Product of digits : " +pro);
	}
	//4
	public static int countNum(int a){
		int count=0;
		while(a>0)
		{
			a = a/10;
			count = count + 1;
		}
		return count;
	}
	//5
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
	//6
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
	//7
	public static int checkPrime(int a){
		if(a==2)
		{
			return 1;
		}
		if(a%2==0)
		{
			return 0;
		}
		for(int i = 2; i<a; ++i)
		{
			if(a%i==0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int checkArmstrong(int a){
		int orignum, rem, sum=0;
		int digit = countNum(a);
		orignum=a;
		while(orignum != 0)
		{
			rem = orignum%10;
			sum = sum + (int)Math.pow(rem,digit);
			orignum = orignum/10;
		}
		if(sum==a)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number to find first digit and last digit: ");
		int a = sc.nextInt();
		System.out.println("First digit: " +findFirstDigits(a));
		System.out.println("Last digit: " +findLastDigits(a));
		System.out.print("Enter any number to find Sum digits of input number: ");
		int b = sc.nextInt();
		findSum(b);
		System.out.print("Enter any number to find Product digits of input number: ");
		int c = sc.nextInt();
		findPro(c);
		System.out.print("Enter any number to count digits of input number : ");
		int d = sc.nextInt();
		System.out.println("Number of digits: " +countNum(d));
		System.out.print("Enter number to swap first and last digit of input number: ");
		int e = sc.nextInt();
		swapDigits(e);
		System.out.print("Enter number to reverse input number: ");
		int f = sc.nextInt();
		reverseNum(f);
		System.out.print("Enter number to check Prime: ");
		int g;
		do{
			while (!sc.hasNextInt()){
				System.out.println("Enter again!");
				sc.next(); 
			}
			g = sc.nextInt();
		}while(g<0);
		
		int h = checkPrime(g);
		if(h==1)
		{
			System.out.println(g+ " is prime number");
		}
		else
		{
			System.out.println(g+ " is not prime number");
		}
		
		System.out.print("Enter number to check Armstrong: ");
		int j;
		do{
			while (!sc.hasNextInt()){
				System.out.println("Enter again!");
				sc.next(); 
			}
			j = sc.nextInt();
		}while(j<0);
		int index = checkArmstrong(j);
		if(index == 1)
		{
			System.out.println(j+ " is Armstrong number");
		}
		else
		{
			System.out.println(j+ " is not Armstrong number");
		}
		System.out.print("Enter range of number 1 to : ");
		int n = sc.nextInt();
		System.out.println("All Armstrong number: ");
		for(int i = 1;i<n; i++)
		{
			if(checkArmstrong(i) == 1)
			{
				System.out.println(i+" ");
			}
		}
	}
}