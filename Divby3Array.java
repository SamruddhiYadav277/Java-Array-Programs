/*
Q30. Replace All Elements Divisible by 3 with -1.
Input: [3, 6, 7, 9, 10]
Output: [-1, -1, 7, -1, 10]


Explanation:
 Elements divisible by 3 are 3, 6, 9. These are replaced with -1. Other elements remain unchanged.
*/
public class Divby3Array
{
	public static void main(String[] args)
	{
		int a[] = {3, 6, 7, 9, 10};
		int n = a.length;
		System.out.print("The given array is: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			if(a[i]%3==0)
			{
				a[i]=-1;
			}
		}
		System.out.println("The final Array is");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+ " ");
		}
	}
}