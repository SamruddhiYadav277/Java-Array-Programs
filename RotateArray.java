/*
Q24. Write a program in java to rotate an array by N positions ?
	
Expected Output:

	The given array is: 0  3  6  9  12  14  18  20  22  25  27

	From 4th position the values of the array are: 12 14 18 20 22 25 27 
	Before 4th position the values of the array are: 0  3  6  9 
	After rotating from 4th position the array is: 12 14 18 20 22 25 27 0 3  6 9

*/
import java.util.Scanner;
public class RotateArray
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		
		int a[] =new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++)
		{
		   a[i]=sc.nextInt();
		}
		System.out.println("Enter the position in array");
		int pos = sc.nextInt();

		System.out.print("The given array is: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}

		System.out.print("\nFrom 4th position the values of the array are: ");
		for(int i=pos;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}

		System.out.print("\nBefore 4th position the values of the array are: ");
		for(int i=0;i<pos;i++)
		{
			System.out.print(a[i]+" ");
		}

		System.out.print("\nAfter rotating from 4th position the array is: ");
		for(int i=pos;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}

		for(int i=0;i<pos;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}