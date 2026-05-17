/*
Q29. Rearrange the array so that even and odd numbers alternate. Assume the number of even and odd elements is equal.
	Input :- arr = [1, 2, 3, 4, 5, 6]
	Output :-  [2, 1, 4, 3, 6, 5]
Explanation:
Even and odd elements are rearranged to appear alternately: Even → Odd → Even → Odd.
The relative order within even and odd groups may not be important, but alternation is maintained.

*/

import java.util.Scanner;

public class EvenOddAlternate
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array");
		int n = sc.nextInt();

		int a[] = new int[n];
		int even[] = new int[n/2];
		int odd[] = new int[n/2];

		int e = 0, o = 0;

		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();

			if(a[i] % 2 == 0)
				even[e++] = a[i];
			else
				odd[o++] = a[i];
		}

		System.out.print("Rearranged array: ");

		for(int i=0;i<n/2;i++)
		{
			System.out.print(even[i] + " " + odd[i] + " ");
		}
	}
}




/*
public class ArrayAlternateEvenOdd
{
	public static void main (String [] args)
	{
		
     int[] a = {111,333,777,222,444,666};
     int[] b = new int[a.length];

     int temp;
     int j = 0;
     int n = a.length;

     for(int i = 0; i < n; i++)
     {
       temp = a[i];

       if(j % 2 == 0)   // even index in b
       {
        if(temp % 2 == 0)   // even number
        {
            b[j] = temp;
            j++;

            // remove element from array a
            for(int k = i; k < n-1; k++)
            {
                a[k] = a[k+1];
            }

            n--;
            i = -1;   // restart checking
        }
    }
}
System.out.println("Array after alternate Even Odd arrangement:");

for(int i = 0; i < j; i++)
{
    System.out.print(b[i] + " ");
}
*/