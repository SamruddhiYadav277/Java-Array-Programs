	/*
	Q9. Write a java program to copy one array to another array.
	Input : Array1 = {5, 10, 15, 20}
	Output : Array2 = {5, 10, 15, 20}
	Explanation:
	Copy each element of Array1 into Array2 using index-by-index assignment.
	*/
	import java.util.Scanner;
	public class DupArray
	{
		public static void main (String [] args)
		{
			Scanner sc= new Scanner (System.in);
			System.out.println("Entrt the Array size");
			int n = sc.nextInt();
			int a[]=new int [n];
			System.out.println("Entrt the Array elements");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int b[]=new int [n];
			for(int i=0;i<n;i++)
			{
				b[i]=a[i];
				
			}
			System.out.print("Array2 = ");
			for(int i=0;i<n;i++)
			{
			 System.out.print( b[i]+ " " );
			}
		}
	}