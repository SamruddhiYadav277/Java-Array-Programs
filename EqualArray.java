/*
Q22. Write a Java program to check whether two integer arrays are equal.
 Two arrays are considered equal if:
Both arrays have the same length
Corresponding elements at each index are exactly the same
Do not use inbuilt methods like Arrays.equals().
Input :- Array1 = {10, 20, 30, 40}
            Array2 = {10, 20, 30, 40}

Output :- Arrays are equal.
Explanation
First, check if the lengths of both arrays are equal
If lengths are different → arrays are not equal
If lengths are same, compare elements one by one using a loop
If any element mismatch is found → arrays are not equal
If all elements match → arrays are equal
*/
import java.util.Scanner;
public class EqualArray
{
	public static void main (String [] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of 1st array");
		int n= sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter the size of 2nd array");
		int m= sc.nextInt();
		int b[]=new int[m];
		
		if(n!=m)
		{
			System.out.println("Arrays are not equal");
			return;
		}
		
		System.out.println("Enter the elements of 1st array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the elements of 2nd array");
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		boolean equal = true;
		for(int i=0;i<n;i++)
			{
				if(a[i] != b[i])
			    {
				  equal = false;
				  break;
			    }
				
				
			}
		if(equal)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");
	}
}