import java.util.Scanner;
import java.lang.NegativeArraySizeException;
public class Homework4{
	public static void findMax(int[] arr, int n){
		int max = arr[0];
		for (int i = 1;i<n; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Max value: " +max);
	}
	public static void sumOfNegative(int[] arr, int n){
		int sum = 0;
		for(int i=0; i<n;i++)
		{
				if(arr[i]<0)
				{
					sum = sum + arr[i];
				}
		}
		System.out.println("Sum of all non-positive numbers: " +sum);
				
	}
	public static void sumOfEven(int[] arr, int n){
		int sum = 0;
		for(int i=0; i<n;i++)
		{
				if(arr[i]%2==0)
				{
					sum = sum + arr[i];
				}
		}
		System.out.println("Sum of all even numbers: " +sum);
				
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in the array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements of array: ");
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}
		findMax(a,n);
		sumOfNegative(a,n);
		sumOfEven(a,n);
	}
}