public class CircularSubarray
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4};
        int n = a.length;

        for(int i = 0; i < n; i++)   // starting index
        {
            for(int j = 1; j <= n; j++)   // length of subarray
            {
                for(int k = 0; k < j; k++)   // print elements
                {
                    System.out.print(a[(i + k) % n] + " ");
                }
                System.out.println();
            }
        }
    }
}