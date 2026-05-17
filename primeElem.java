/*
Q36. Count the number of prime numbers in an array.
Input: arr = [2, 5, 6, 9, 11,13,15]
Output: Count of prime numbers = 3
Explanation: Check each element if it is prime 
(only divisible by 1 and itself), and count such elements.
*/
public class primeElem
{
    public static void main(String[] args)
    {
        int a[] = {2, 5, 6, 9, 11,13,17,19};
        int n = a.length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			int num=a[i];
			boolean isPrime = true;
			
			if(num <= 1)
                isPrime = false;

            for(int j = 2; j <= num/2; j++)
            {
                if(num % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
			if(isPrime)
			{
				count++;
			}
		}
		 System.out.println("Count of prime numbers = " + count);
			
		
	}
}