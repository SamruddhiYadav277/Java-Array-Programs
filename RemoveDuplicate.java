/*
Q14.  Write a java program to remove duplicated values from arrays.

Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
Traverse the array, check if element already exists before adding to result, thus avoiding duplicates.
*/
import java.util.Scanner;

public class RemoveDuplicate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter size of array:");
        n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Unique elements are:");

        for(int i = 0; i < n; i++)
        {
            boolean isDuplicate = false;

            for(int j = 0; j < i; j++)
            {
                if(a[i] == a[j])
                {
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate)
            {
                System.out.print(a[i] + " ");
            }
        }
    }
}