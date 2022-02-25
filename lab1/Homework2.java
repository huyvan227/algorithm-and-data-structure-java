import java.util.Scanner;
public class Homework2{
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
		
		int b = checkPrime(a);
		if(b==1)
		{
			System.out.print(a+ " is prime number");
		}
		else
		{
			System.out.print(a+ " is not prime number");
		}
	}
}