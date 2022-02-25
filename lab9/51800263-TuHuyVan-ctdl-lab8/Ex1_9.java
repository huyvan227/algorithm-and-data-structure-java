import java.lang.Math;
public class Ex1_9{
	public static void main(String[] args){
		System.out.println(checkPrime(11,11/2));
		System.out.println(checkPrime(9,9/2));
		System.out.println(checkPrime(23,23/2));
		System.out.println("factorial of 4: " +factorial(4));
		System.out.println("factorial of 7: " +factorial(7));
		System.out.println("factorial of 10: " +factorial(10));
		System.out.println("2^4 : " +compute2n(4));
		System.out.println("2^3 : " +compute2n(3));
		System.out.println("6^5 : " +computexn(6,5));
		System.out.println("5^3 : " +computexn(5,3));
		System.out.println("8451231 has: " +countDigits(8451231)+" digits");
		System.out.println("999 has: " +countDigits(999)+" digits");
		System.out.println("1 has: " +countDigits(1)+" digits");
		System.out.println("(2*5)+1 : " +expression1(5));
		System.out.println("(2*3)+1 : " +expression1(3));
		System.out.println("4/2 + 3/2 + 2/2 + 1/2 : " +expression2(4));
		System.out.println("5/2 + 4/2 + 3/2 + 2/2 + 1/2  : " +expression2(5));
		System.out.println("4!+3!+2!+1!: "+expression3(4));
		System.out.println("sqrt(4): "+expression4(4));
		System.out.println("4!*3!*2!*1!: "+expression5(4));
		int arr[] = {7,6,5,29,8};
		System.out.println("sum of {7,6,5,29,8)}: " +findSum(arr,5));
		System.out.println("{7,6,5,29,8)}: " +findMin(arr,5));
		int arr1[]={1,0,1};
		System.out.println("{1,0,1}: " +checkPalindrome(arr1,0,3-1));
		System.out.println("{7,6,5,29,8}: " +checkPalindrome(arr,0,5-1));
	}
	public static String checkPrime(int num,int i){
		if(i == 1){
			return(num +" is prime number ");
		}
		else{
			if(num%i == 0){
				return(num +" is not prime number ");
			}
			else{
				return checkPrime(num,i-1);
			}
		}
	}
	public static double factorial(int n){
		if(n==0|| n==1){
			return 1;
		}
		return n*factorial(n-1);
	}
	public static double compute2n(int n){
		if(n==0){
			return 1;
		}
		if(n==1){
			return 2;
		}
		else{
			return 2*compute2n(n-1);
		}
	}
	public static double computexn(int x,int n){
		if(n==0){
			return 1;
		}
		if(n==1){
			return x;
		}
		else{
			return x*computexn(x,n-1);
		}
	}
	public static int countDigits(int n){
		if (n<10){
			return 1;
		}
		else{
			return 1 + countDigits(n/10);
		}
	}
	public static int expression1(int n){
		if(n==0){
			return 1;
		}
		else{
			return (2*n+1) + expression1(n-1);
		}
	}
	public static float expression2(int n){
		if(n==0){
			return 0;
		}
		else{
			return (float)n/2 + expression2(n-1);
		}
	}
	public static double expression3(int n){
		if(n==0||n==1){
			return 1;
		}
		else{
			return factorial(n) + expression3(n-1);
		}
	}
	public static double expression4(int n){
		if(n==0){
			return 0;
		}
		else{
			return Math.sqrt(n) + expression4(n-1);
		}
	}
	public static double expression5(int n){
		if(n==0||n==1){
			return 1;
		}
		else{
			return factorial(n)*expression5(n-1);
		}
	}
	public static int findMin(int a[],int n){
		if(n == 1){
			return a[0];
		}
		return a[n-1]<findMin(a,n-1)?a[n-1]:findMin(a,n-1);
			
	}
	
	public static int findSum(int a[],int n){
		if(n==1){
			return a[0];
		}
		return a[n-1]+findSum(a,n-1);
	}
	
	public static String checkPalindrome(int a[],int start,int end){
		if(end==start){
			return(" is palindrome");
		}
		else{
			if(a[start] != a[end]){
				return ("is not a palindrome");
			}
			else{
				return checkPalindrome(a,start+1,end-1);
			}
		}
	}
	
	
}