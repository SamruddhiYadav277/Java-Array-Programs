/*
Q11. Write a java program to give an array, find the second largest element.
Input : Array = {12, 35, 1, 10, 34, 1}
Output : Second largest = 34
Explanation:
First largest is 35, second largest is the next maximum (34). We maintain two variables (largest, secondLargest).
*/
import java.util.Scanner;
public class SecondLarge
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
		  
		  int largest=a[0];
		  int secondLargest=a[0];
		  	  
        for(int i = 1; i < n; i++)
        {
            if(a[i] > largest)
            {
                secondLargest = largest;
                largest = a[i];
            }
            else if(a[i] > secondLargest && a[i] != largest)
            {
                secondLargest = a[i];
            }
        }

        System.out.println("Second Largest element is: " + secondLargest);
    }
}
