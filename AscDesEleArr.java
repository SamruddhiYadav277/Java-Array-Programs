/*
Q39. Write a Java program to sort a given array in ascending & descending order.
    Input :Array = [12, 5, 9, 34, 1]
	Output :Ascending Order: [1, 5, 9, 12, 34]
            Descending Order: [34, 12, 9, 5, 1]
Explanation:
Sorting means arranging elements in a particular order.
In ascending order, numbers are arranged from smallest to largest.
For example: 1 < 5 < 9 < 12 < 34.
In descending order, numbers are arranged from largest to smallest.
For example: 34 > 12 > 9 > 5 > 1.
The program should first sort the array in ascending order, 
then print the reverse of that order for descending.
*/
public class AscDesEleArr
{
    public static void main(String[] args)
    {
        int arr[] = {12, 5, 9, 34, 1};
		int n=arr.length;

        for(int i = 0; i < n-1; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
		
		System.out.print("Ascending Order: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
		
		System.out.print("\nDescending Order: ");
        for(int i = n-1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }
		
    }
}