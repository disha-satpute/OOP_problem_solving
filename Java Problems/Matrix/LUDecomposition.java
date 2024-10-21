public class LUDecomposition {
    // Function to perform LU Decomposition
    public static void luDecomposition(double[][] matrix) {
        int n = matrix.length;
        double[][] L = new double[n][n];
        double[][] U = new double[n][n];

        // Perform the decomposition
        for (int i = 0; i < n; i++) {
            // Upper Triangular U
            for (int j = i; j < n; j++) {
                U[i][j] = matrix[i][j];
                for (int k = 0; k < i; k++) {
                    U[i][j] -= L[i][k] * U[k][j];
                }
            }

            // Lower Triangular L
            for (int j = i; j < n; j++) {
                if (i == j) {
                    L[i][i] = 1; // Diagonal as 1
                } else {
                    L[j][i] = matrix[j][i];
                    for (int k = 0; k < i; k++) {
                        L[j][i] -= L[j][k] * U[k][i];
                    }
                    L[j][i] /= U[i][i]; // Normalize
                }
            }
        }

        // Print L and U matrices
        System.out.println("L Matrix:");
        printMatrix(L);
        System.out.println("U Matrix:");
        printMatrix(U);
    }

    // Helper function to print a matrix
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double elem : row) {
                System.out.printf("%.2f ", elem);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] matrix = {
            {2, -1, -2},
            {-4, 6, 3},
            {-4, -2, 8}
        };

        luDecomposition(matrix);
    }
}
