/*
Q37. Count the number of Perfect numbers in an array.
Input: arr = [6, 28, 10, 12, 496]
Output: Count of Perfect numbers = 3
Explanation: A Perfect number is equal to the sum of its proper divisors (excluding itself). For each element, 
find the sum of divisors and compare with the number, then count.
*/
public class perfectElem
{
    public static void main(String[] args)
    {
        int a[] = {6, 28, 10, 12, 496};
        int n = a.length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=1;j<a[i];j++)
			{
				if(a[i] % j == 0)
                {
                    sum = sum + j;
                }
            }

            if(sum == a[i])
            {
                count++;
            }
        }

        System.out.println("Count of Perfect numbers = " + count);
    }
}
		