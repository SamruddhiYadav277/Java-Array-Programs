/*
Q49. Write a java program to find unique value in this given array.

	Input :- array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10 
	Output :-  All unique elements in the array are: 3, 20, 12, 10
*/
import java.util.Scanner;
public class uniqueEleArray
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
		 int count;

        System.out.print("All unique elements in the array are: ");

        for(int i = 0; i < a.length; i++)
        {
            count = 0;

            for(int j = 0; j < a.length; j++)
            {
                if(a[i] == a[j])
                {
                    count++;
                }
            }

            if(count == 1)
            {
                System.out.print(a[i] + " ");
            }
        }
    }
}

