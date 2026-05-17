/*
Q33. Check whether the given array is a palindrome.
Input: {1, 2, 3, 2, 1}
Output: true
Explanation:
 A palindrome reads the same forward and backward.
 Forward: 1 2 3 2 1
 Backward: 1 2 3 2 1
 Since both are the same, the array is a palindrome.

*/
public class PalindromeArray
{
    public static void main(String[] args)
    {
        int a[] = {1, 2, 3, 2, 1};

        int i = 0;
        int j = a.length - 1;
        boolean isPalindrome = true;

        while(i < j)
        {
            if(a[i] != a[j])
            {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        System.out.println(isPalindrome);
    }
}