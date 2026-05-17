/*
Q12. Write a program in java to insert an element at desired position from an array.
	Test Data :

	Input the size of array : 6

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to insert : 2
	Value :      200

	Expected Output : The new list is : 1 2 200 3 4 5
*/
import java.util.Scanner;
public class InserPos
  {
	  public static void main (String [] args)
	  {
		  Scanner sc=new Scanner (System.in);
		  int n;
		  System.out.println("Input the size of array :");
           n = sc.nextInt();
		  int a[]=new int [n];
		  System.out.println("Enter  elemnts in an array");
		  
		  for(int i=0;i<n-1;i++)
		  {
			  a[i]=sc.nextInt();
          }
		  
		  System.out.println("Enter the elemnts posiotion in an array");
		  int pos=sc.nextInt();
		  
		  System.out.println("Enter the elemnts  to enter in an array");
		  int ele=sc.nextInt();
		  if(pos<0 || pos>n)
		  {
			  System.out.println("Invalid index number");
			  
		  }
		  else
		  {
		  
		    for(int i = n-1; i >= pos; i--)
            {
             a[i] = a[i-1];
            }
		    a[pos] = ele;
		  
		  
		   System.out.println("Final New array after insertion is :");
		   for(int i=0;i<n;i++)
		   {
			  System.out.print(a[i] + " ");
		   }
		  }
		   
	  }
  }
 