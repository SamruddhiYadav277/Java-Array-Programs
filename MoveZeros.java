/*
Q25. Move all zeros in an array to the end while maintaining the relative order of non-zero elements.
	Input :- arr = [0, 1, 0, 3, 12]
	Output :- arr = [1, 3, 12, 0, 0]
Explanation:
All non-zero elements [1, 3, 12] retain their original order.
All zeros are moved to the end of the array.

*/



import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int k = 0; // Next position for non-zero

        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                // Place non-zero at position k
                a[k] = a[i];

                // If i != k, set current position to zero
                if (i != k) {
                    a[i] = 0;
                }

                k++;
            }
        }

        System.out.println("Array after moving zeros to end:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}