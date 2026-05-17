/*
Q35. Create a new array where each element is the square of the original.
Input: arr = [2, 4, 6, 8]
Output: newArr = [4, 16, 36, 64]
Explanation: For each index, calculate arr[i] * arr[i] and store it in the new array.
*/
public class squareElem
{
    public static void main(String[] args)
    {
        int a[] = {2, 4, 6, 8};
        int n = a.length;
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=a[i]*a[i];
			System.out.print(b[i] +" ");
		}
	}
}