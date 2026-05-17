/*
Q35. Replace each element with its factorial.
Input: arr = [3, 4, 5]
Output: arr = [6, 24, 120]
Explanation: For each element, calculate factorial using repeated multiplication, and update the array element with this value.
*/
public class factorialElem
{
    public static void main(String[] args)
    {
        int arr[] = {3, 4, 5};

        for(int i = 0; i < arr.length; i++)
        {
            int fact = 1;

            for(int j = 1; j <= arr[i]; j++)
            {
                fact = fact * j;
            }

            arr[i] = fact;
        }

        System.out.println("Final Array:");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}