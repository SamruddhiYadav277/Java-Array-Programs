/*
Q34. Return the first element that repeats in the array.
Input: {10, 5, 3, 4, 3, 5, 6}
Output: First repeating element is 5
Explanation:
Traverse from left:
10 → first time.
5 → first time.
3 → first time.
4 → first time.
3 → already seen earlier → repeating, but not the first repeating (we must check carefully).
5 → this was the earliest element that repeats.
Therefore, the first repeating element is 5.
*/
public class FirstRepeating
{
    public static void main(String[] args)
    {
        int a[] = {10, 6, 3, 4, 3, 5, 6};
        int n = a.length;
        boolean found = false;

        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(a[i] == a[j])
                {
                    System.out.println("First repeating element is " + a[i]);
                    found = true;
                    break;
                }
            }

            if(found)
            {
                break;
            }
        }

        if(!found)
        {
            System.out.println("No repeating element");
        }
    }
}