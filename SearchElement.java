/*
Q6. Write a java program to search an element in an array , its element found or not.
*/
import java.util.Scanner;
public class SearchElement
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int selement;
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter elementto search");
		selement = sc.nextInt();
	
		boolean found = false;

		for(int i = 0; i < n; i++)
		{
			if(a[i] == selement)
			{
				System.out.println("Element " + selement + " found at index " + i);
				found = true;
				break;  
			}
		}

		if(found == false)
		{
			System.out.println("Element not found");
		}
		
	}
}

