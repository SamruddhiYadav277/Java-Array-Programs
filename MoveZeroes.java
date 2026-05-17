/*
Write a program to move all zero elemnts to end of an array.
*/

public class MoveZeroes {
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 4, 0, 5};
        int n = arr.length;

        int count = 0;  

        
        for(int i = 0; i < n; i++) 
		{
            if(arr[i] != 0) 
			{
                arr[count] = arr[i];
                count++;
            }
        }

        
        while(count < n) {
            arr[count] = 0;
            count++;
        }

        
        for(int i = 0; i < n; i++)
		{
            System.out.print(arr[i] + " ");
        }
    }
}
			