/*
Q10. Write a program in java to delete an element at desired position from an array.
	Test Data :

	Input the size of array : 5

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to delete : 3

	Expected Output : The new list is : 1 2 3 5
*/
import java.util.Scanner;
public class positionArray
  {
	  public static void main (String [] args)
	  {
		  Scanner sc=new Scanner (System.in);
		  int n,pos;
		  System.out.println("Input the size of array :");
           n = sc.nextInt();
		  int a[]=new int [n];
		  System.out.println("Enter  elemnts in an array");
		  
		  for(int i=0;i<n;i++)
		  {
			  a[i]=sc.nextInt();
          }
		  
		  System.out.println("Input the index  position of element to delete :");
          pos = sc.nextInt();
          if(pos < 0 || pos >= n)
          {
            System.out.println("Invalid index position!");
          }
		  else
		  {
            for(int i = pos; i < n - 1; i++)
            {
             a[i] = a[i + 1];
            }
            
            System.out.println("The new list is :");
            for(int i = 0; i < n - 1; i++)
            {
              System.out.print(a[i] + " ");
            } 
		  }		  

      }
 }

  