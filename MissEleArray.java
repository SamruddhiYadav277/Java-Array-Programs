/*
Q8. Write a java program to find missing elements in an array.
Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
Output : Missing elements = {3, 6}
Explanation:
Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, it is missing.
*/
import java.util.Scanner;
public class MissEleArray
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the size of an array");
		int n= sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter the Elements of an array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		// Find maximum element
		int max=a[0];
        for(int i =1;i<n;i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }
       
        System.out.print("Missing elements = ");
		// Check numbers from 1 to max
        for(int i = 1; i <= max; i++)
        {
            boolean found = false;

            for(int j = 0; j < n; j++)
            {
                if(a[j] == i)
                {
                    found = true;
                    break;
                }
            }

            if(found == false)
            {
                System.out.print(i + " ");
            }
        }
    }
}

		
	

		