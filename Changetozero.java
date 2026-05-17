/*
Q19. Given an integer array, replace all the negative numbers in the array with 0 and print the updated array.

Explanation
Traverse the array from the first element to the last.
Check each element:
If the element is negative, replace it with 0.
If the element is zero or positive, keep it as it is.
After completing the traversal, print the modified array.
Input :- Array = [5, -3, 7, -1, 0, -6, 4]

Output :- Updated Array = [5, 0, 7, 0, 0, 0, 4]
*/
import java.util.Scanner;
public class Changetozero
  {
	  public static void main (String [] args)
	  {
		  Scanner sc=new Scanner (System.in);
		  int n;
		  System.out.println("Input the size of array :");
           n = sc.nextInt();
		  int a[]=new int [n];
		  System.out.println("Enter  elemnts in an array");
		  
		  for(int i=0;i<n;i++)
		  {
			  a[i]=sc.nextInt();
          }
		  for(int i=0;i<n;i++)
		  {
		   if(a[i]<0)
		   {
			   a[i]=0;
		   }
		  }
		  System.out.println("Final New array is :");
		   for(int i=0;i<n;i++)
		   {
			  System.out.print(a[i] + " ");
		   }
	  }
	 
  }
 