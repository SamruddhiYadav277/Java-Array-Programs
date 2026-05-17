/*
Q47. Write a java program to merge of two given array.

	Input :- First Array :-1 2 3 4 5
             	 Second Array :-6 7 8 9 10 

	Output :- 1 2 3 4 5 6 7 8 9 10
*/
import java.util.Scanner;
public class mergeArray
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter size of 1st array: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
		
		System.out.print("Enter size of 2nd array: ");
        int m = sc.nextInt();

        int b[] = new int[m];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++)
        {
            b[i] = sc.nextInt();
        }
		
		int c[] = new int[n+m];
        for(int i = 0 ; i < n+m ; i++)
        {
          if(i < n)
             c[i] = a[i];
          else
             c[i] = b[i-n];
        }

        System.out.println("Merged Array:");
        for(int i = 0; i < n + m; i++)
        {
            System.out.print(c[i] + " ");
        }
    }
}
		
 