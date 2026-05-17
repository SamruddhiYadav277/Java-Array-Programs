/*
Q20. Write a Java program to print all elements from an integer array that are greater than a given number.
Explanation
An integer array is given.
A number N is also given.
Traverse the array using a loop.
Compare each element with N.
If the element is greater than N, print it.
Input :- Array: 10 25 5 40 18
 Given Number: 20

Output :- Elements greater than 20 :
    25 40
*/
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
public class GreatArray
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
		  
		  System.out.println("Enter the elemnts");
		  int m=sc.nextInt(); 
		  System.out.println("Elements greater than " + m + " :");
		    for(int i = 0; i<n; i++)
            {
				if(a[i]>m)
				{
					System.out.print(a[i] + " ");
				}
			}
	  }
  }
 
             
		  
		  
		   
 