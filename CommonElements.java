/*
Q15. Write a java program to find common elements between two arrays.
Input :
 Array1 = {1, 2, 3, 4, 5}
 Array2 = {3, 4, 5, 6, 7}
Output : Common elements = {3, 4, 5}
Explanation :
Compare each element of Array1 with all elements of Array2, if match found → it is a common element.
*/
import java.util.Scanner;

public class CommonElements
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.println("Enter size of first array:");
        n1 = sc.nextInt();

        int a[] = new int[n1];

        System.out.println("Enter elements of first array:");
        for(int i = 0; i < n1; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array:");
        n2 = sc.nextInt();

        int b[] = new int[n2];

        System.out.println("Enter elements of second array:");
        for(int i = 0; i < n2; i++)
        {
            b[i] = sc.nextInt();
        }
		      

        System.out.println("Common elements are:");

        for(int i = 0; i < n1; i++)
        {
            for(int j = 0; j < n2; j++)
            {
                if(a[i] == b[j])
                {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }
}