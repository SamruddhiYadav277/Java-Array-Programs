/*
Q18. Write a Java program to check whether a given array is empty or not.

Explanation
Every array has a predefined property called length.
If array.length == 0, then the array is empty.
Otherwise, the array contains elements.

Input :- Array elements: { }
Output :- Array is empty
*/
import java.util.Scanner;
public class emptyArr
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("Input the size of array :");
		n = sc.nextInt();

		int a[] = new int[n];

		if(a.length == 0)
		{
			System.out.println("The array is empty");
		}
		else
		{
			System.out.println("The array is not empty");
		}
	}
}