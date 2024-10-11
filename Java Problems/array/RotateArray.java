//Given an array, rotate the array by one position in a clockwise direction.
public class RotateArray {

    public static void rotateArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return; // Handle empty array case
        }

        int lastElement = arr[arr.length - 1]; // Step 1: Store the last element

        // Step 2: Shift elements to the right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Step 3: Place the last element at the first position
        arr[0] = lastElement;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        rotateArray(array);
        
        // Output the rotated array
        for (int num : array) {
            System.out.print(num + " ");
        } // Output: 5 1 2 3 4
    }
}