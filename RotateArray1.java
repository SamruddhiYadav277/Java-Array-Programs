import java.util.Scanner;

public class RotateArray1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array");
		int n = sc.nextInt();

		int a[] = new int[n];

		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the position to rotate from");
		int pos = sc.nextInt();

		System.out.print("The given array is: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}

		// Rotating array using shifting
		for(int i=0;i<pos;i++)
		{
			int first = a[0];

			for(int j=0;j<n-1;j++)
			{
				a[j] = a[j+1];   // shifting left
			}

			a[n-1] = first;
		}

		System.out.print("\nAfter rotating from "+pos+" position the array is: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}