import java.util.Scanner;
public class AverageArray
{
	public static void main (String [] args)
	{
		Scanner sc= new Scanner (System.in);
		int n;
		int sum=0;
		
		System.out.println("Enter the size of an array");
		 n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Elements in  an array");
        for(int i=0;i<n;i++)
		{
          a[i]=sc.nextInt();
        }
		System.out.println("Avearge of an array is:");
		for(int i=0;i<n;i++)
		{
			sum=a[i]+sum;
			
		}
		int average=sum/n;
		System.out.println(average);
	}
}
 		
		