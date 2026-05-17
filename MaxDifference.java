/*
Q43. Write a program in java to find out the maximum difference between any two elements such that larger element appears after the smaller number.
	
Expected Output :
		The given array is : 7 9 5 6 13 2
		The elements which provide maximum difference is: 5, 13
		The Maximum difference between two elements in the array is: 8
*/
public class MaxDifference
{
    public static void main(String[] args)
    {
        int a[] = {7,9,5,6,13,2};

        int min = a[0];
        int maxDiff = a[1] - a[0];
        int x = a[0];
        int y = a[1];

        for(int i = 1; i < a.length; i++)
        {
            if(a[i] - min > maxDiff)
            {
                maxDiff = a[i] - min;
                x = min;
                y = a[i];
            }

            if(a[i] < min)
            {
                min = a[i];
            }
        }

        System.out.print("The given array is : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

        System.out.println("\nThe elements which provide maximum difference is: "+x+", "+y);
        System.out.println("The Maximum difference between two elements in the array is: "+maxDiff);
    }
}