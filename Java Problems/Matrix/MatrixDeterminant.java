// Find Determinant of a given Matrix.
public class MatrixDeterminant {
    // Function to calculate the determinant of a matrix
    public static double determinant(double[][] matrix) {
        int n = matrix.length;
        
        // Base case for 2x2 matrix
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        double det = 0;

        // Recursive case for larger matrices
        for (int p = 0; p < n; p++) {
            // Create a minor matrix
            double[][] minor = new double[n - 1][n - 1];
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j < p) {
                        minor[i - 1][j] = matrix[i][j];
                    } else if (j > p) {
                        minor[i - 1][j - 1] = matrix[i][j];
                    }
                }
            }
            // Recursive calculation with alternating signs
            det += Math.pow(-1, p) * matrix[0][p] * determinant(minor);
        }
        return det;
    }

    public static void main(String[] args) {
        double[][] matrix = {
            {1, 2, 3},
            {0, 4, 5},
            {1, 0, 6}
        };

        System.out.println("Determinant of the matrix: " + determinant(matrix));
    }
}
