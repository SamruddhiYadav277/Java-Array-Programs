/*
 WAP to find missng value from given sorted array
 */

public class MissingValue
{
    public static void main(String[] args)
    {
        int a[] = {1,5,8,9,12};

        for(int i = 0; i < a.length - 1; i++)
        {
            for(int j = a[i]; j < a[i+1] - 1; )
            {
                System.out.print(++j + "  ");
            }
        }
    }
}