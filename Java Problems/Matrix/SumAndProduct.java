public class SumAndProduct
 {
    
    // Function to add two matrices
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] sum = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        
        return sum;
    }

    // Function to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        // Check if multiplication is possible (colsA must equal rowsB)
        if (colsA != rowsB) {
            throw new IllegalArgumentException("Matrix A's columns must equal Matrix B's rows.");
        }

        int[][] product = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    product[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return product;
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

    public static void main(String[] args) {
        // Define two matrices
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrixB = {
            {7, 8, 9},
            {10, 11, 12}
        };

        // Calculate the sum of two matrices
        int[][] sum = addMatrices(matrixA, matrixB);
        System.out.println("Sum of matrices:");
        printMatrix(sum);

        // Define two matrices for multiplication
        int[][] matrixC = {
            {1, 2},
            {3, 4},
            {5, 6}
        };

        int[][] matrixD = {
            {7, 8},
            {9, 10}
        };

        // Calculate the product of two matrices
        int[][] product = multiplyMatrices(matrixC, matrixD);
        System.out.println("Product of matrices:");
        printMatrix(product);
    }
}
