/*
Q27. Write a java program to count the frequency of each element in a given array.
Input:
Array = {1, 2, 2, 3, 3, 3, 4}
Output:
 1 → 1 time
 2 → 2 times
 3 → 3 times
 4 → 1 time
Explanation:
For each element, count how many times it occurs in the array using nested traversal.

*/
import java.util.Scanner;

public class FrequencyArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array");
		int n = sc.nextInt();

		int a[] = new int[n];

		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}

		int count;

		for(int i=0;i<n;i++)
		{
			count = 1;

			if(a[i] == -1)   // already counted
			continue;

			for(int j=i+1;j<n;j++)
			{
				if(a[i] == a[j])
				{
					count++;
					a[j] = -1;   // mark as visited
				}
			}

			System.out.println(a[i] + " ==>" + count + " times");
		}
	}
}