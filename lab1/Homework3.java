import java.util.Scanner;
public class Homework3{
	public static int countNum(int a){
		int count=0;
		while(a>0)
		{
			a = a/10;
			count = count + 1;
		}
		return count;
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
		int a;
		System.out.println("Enter number to check: ");
		do{
			while (!sc.hasNextInt()){
				System.out.println("Enter again!");
				sc.next(); 
			}
			a = sc.nextInt();
		}while(a<0);
		int index = checkArmstrong(a);
		if(index == 1)
		{
			System.out.println(a+ " is Armstrong number");
		}
		else
		{
			System.out.println(a+ " is not Armstrong number");
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