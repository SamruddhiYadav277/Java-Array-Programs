/*
Q44.Write a program in java to find two elements whose sum is closest to zero.
			 
Expected Output :
		The given array is : 38 44 63 -51 -35 19 84 -69 4 -46
		The Pair of elements whose sum is minimum are: [44, -46]

*/
public class ClosestSumZero
{
    public static void main(String[] args)
    {
        int a[] = {38,44,63,-51,-35,19,84,-69,4,46};

        int min = 99999;
        int x = 0, y = 0;

        for(int i = 0; i < a.length; i++)
        {
            for(int j = i + 1; j < a.length; j++)
            {
                int sum = a[i] + a[j];

                int absSum;
                if(sum < 0)
                    absSum = -sum;
                else
                    absSum = sum;

                if(absSum < min)
                {
                    min = absSum;
                    x = a[i];
                    y = a[j];
                }
            }
        }

        System.out.println("The Pair of elements whose sum is minimum are: [" + x + ", " + y + "]");
    }
}

