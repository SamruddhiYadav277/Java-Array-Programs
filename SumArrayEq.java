/*
Q26. Write a java program to count all pairs of elements in an array whose sum is equal to a given number.
	
Input :- arr = [1, 5, 7, -1, 5]        sum = 6
Output :- 3
Explanation:
Pairs whose sum = 6 are:
(1, 5) → first occurrence
(7, -1)
(1, 5) → second occurrence (from the second 5)
Total pairs = 3
*/
public class SumArrayEq
{
	public static void main(String[] args)
	{
		int a[] = {1, 5, 7, -1, 5};
		int n = a.length;
		int sum = 6;
		int count=0;

		System.out.print("The given array is: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				
		        if(a[i]+a[j]==sum)
				{
					count++;
				}
			}
		}
		System.out.println("Total pairs = " + count);
	}
}
