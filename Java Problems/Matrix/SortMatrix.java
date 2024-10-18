import java.util.Arrays;

public class SortMatrix {

    public static void sortMatrix(int[][] matrix) {
        int N = matrix.length;
        int[] arr = new int[N * N];

        // Step 1: Flatten the matrix into an array
        int index = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[index++] = matrix[i][j];
            }
        }

        // Step 2: Sort the array
        Arrays.sort(arr);

        // Step 3: Fill the matrix with sorted elements
        index = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = arr[index++];
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {3, 1, 5},
            {9, 2, 6},
            {4, 8, 7}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        sortMatrix(matrix);
        
        System.out.println("Sorted Matrix:");
        printMatrix(matrix);
    }

    // Helper function to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
