/*
Q3. Write a Java program to display even & odd values from an array.
Input:
 Array Size = 6
 Array Elements = 11 20 33 42 55 60
Output:
 Even Values = 20 42 60
 Odd Values = 11 33 55
Explanation:
Traverse the array element by element.
If an element is divisible by 2, it is even. Otherwise, it is odd.
Separate lists are displayed for even and odd values.
*/
import java.util.Scanner;
public class ArrEvOdd
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
	    int arr[] = new int[n];
		System.out.println("Enter the Elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Even Values = ");
		for(int i = 0; i < n; i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.print(arr[i] + " ");
			}
		}
		
		System.out.println();
		
		System.out.print("Odd Values = ");
		for(int i = 0; i < n; i++)
		{
			if(arr[i] % 2 != 0)
			{
				System.out.print(arr[i] + " ");
			}
		}
	}
}


/*
import java.util.Scanner;

public class ArrEvOdd
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the Elements of array:");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		String even = "";
		String odd = "";
		
		
		for(int i = 0; i < n; i++)
		{
			if(arr[i] % 2 == 0)
			{
				even = even + arr[i] + " ";
			}
			else
			{
				odd = odd + arr[i] + " ";
			}
		}
		
		System.out.println("Even Values = " + even);
		System.out.println("Odd Values = " + odd);
	}
}
/