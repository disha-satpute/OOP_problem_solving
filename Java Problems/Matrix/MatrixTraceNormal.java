//Find the trace and normal of a given matrix. The normal of a matrix is the square root of the sum of squares of all the elements of a matrix. The trace of a matrix is the sum of all the elements present in the principal diagonal (upper left to lower right).

public class MatrixTraceNormal {

    public static void calculateTraceAndNormal(int[][] matrix) {
        int N = matrix.length;
        int M = matrix[0].length;
        
        int trace = 0;
        double normal = 0.0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (i == j) {
                    trace += matrix[i][j];
                }
                normal += Math.pow(matrix[i][j], 2); 
        }

        normal = Math.sqrt(normal); 

        // Print results
        System.out.println("Trace of the matrix: " + trace);
        System.out.println("Normal of the matrix: " + normal);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        calculateTraceAndNormal(matrix);
    }
}
