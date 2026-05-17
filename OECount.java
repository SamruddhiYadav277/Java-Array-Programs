/*
Q5. Write a Java program to count even & odd values from an array.
Input:
 Array Size = 7
 Array Elements = 12 17 24 39 40 55 70
Output:
 Count of Even Values = 4
 Count of Odd Values = 3
Explanation:
Initialize counters: evenCount = 0, oddCount = 0.
For each element in the array:


If divisible by 2 → increase evenCount.
Otherwise → increase oddCount.


Final counts are displayed.
*/
import java.util.Scanner;
public class OECount
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Array size");
		int n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the Array elements");
		
		for(int i=0;i<n;i++)
		{
			a[i]= sc.nextInt();
		}
		System.out.println();
		int countEven=0;
		int countOdd=0;
		
		
		for(int i = 0; i < n; i++)
		{
			if(a[i] % 2 == 0)
			{
				countEven++;
			}
			else
			{
				countOdd++;
			}
		}
		
		System.out.println("Even = " + countEven);
		System.out.println("Odd  = " + countOdd);
	}
}
