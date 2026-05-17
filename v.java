public class MoveZeroes {
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 4, 0, 5};
        int n = arr.length;

        int count = 0;  // position for next non-zero element

        // Move non-zero elements forward
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        // Fill remaining positions with 0
        while(count < n) {
            arr[count] = 0;
            count++;
        }

        // Print result
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
			