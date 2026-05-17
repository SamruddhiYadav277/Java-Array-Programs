/*
Q28. Write a java program to find the union array of two unsorted arrays.
	Input :-  arr1 = [1, 2, 3]  
   arr2 = [2, 3, 4, 5]
	Output :- [1, 2, 3, 4, 5]

Explanation:
Union combines all elements from both arrays.
Duplicates are removed to keep only unique

*/

import java.util.*;

public class UnionArray
{
    public static void main(String[] args)
    {
        int arr1[] = {1, 2, 3};
        int arr2[] = {2, 3, 4, 5};

        HashSet<Integer> set = new HashSet<>();

        // Add elements of first array
        for(int i = 0; i < arr1.length; i++)
        {
            set.add(arr1[i]);
        }

        // Add elements of second array
        for(int i = 0; i < arr2.length; i++)
        {
            set.add(arr2[i]);
        }

        System.out.println("Union Array:");
        for(int num : set)
        {
            System.out.print(num + " ");
        }
    }
}