public class MaxDifference1
{
    public static void main(String[] args)
    {
        int[] a = {7, 9, 5, 6, 13, 2};

        int first = -1;
        int second = -1;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < a.length; i++)   // first element
        {
            for(int j = 0; j < a.length; j++)   // second element
            {
                if(a[j] > a[i])
                {
                    int diff = a[j] - a[i];

                    if(diff > max)
                    {
                        max = diff;
                        first = a[i];
                        second = a[j];
                    }
                }
            }
        }

        System.out.println("First element: " + first);
        System.out.println("Second element: " + second);
        System.out.println("Maximum difference: " + max);
    }
}