/*
Q38. Write a program in java to find the smallest missing element from a sorted array?
		
Expected Output :
		The given array is : 0 1 3 4 5 6 7 9
		The missing smallest element is: 2
*/
public class missingEleArr
{
    public static void main(String[] args)
    {
        int arr[] = {0, 1, 3, 4, 5, 6, 7, 9};

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != i)
            {
                System.out.println("The smallest missing element is: " + i);
                break;
            }
        }
    }
}