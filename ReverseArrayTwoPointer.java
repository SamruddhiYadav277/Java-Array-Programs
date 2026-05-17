/*
Reverse array using two pointer.
*/
public class ReverseArrayTwoPointer
{
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4,5};

        int i = 0;
        int j = a.length - 1;

        while(i < j)
        {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }

        for(int num : a)
        {
            System.out.print(num + " ");
        }
    }
}