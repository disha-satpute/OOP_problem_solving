//Given a two dimensional array, Write a program to print lower triangular matrix.  

public class LowerTriangularMatrix {
    public static void printLowerTriangular(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("Lower Triangular Matrix:");

        for (int i = 0; i < rows; i++) {


            for (int j = 0; j < cols; j++) {

                // Check if we are in the lower triangular part
                if (i >= j) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("0 "); // Print 0 for elements above the diagonal
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        printLowerTriangular(matrix);
    }
}
