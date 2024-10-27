public class MatrixSumProduct {
    public static void calculateSumAndProduct(int[][] matrix) {
        int sum = 0;
        long product = 1; 

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];       
                product *= matrix[i][j]; 
            }
        }

        System.out.println("Sum of matrix elements: " + sum);
        System.out.println("Product of matrix elements: " + product);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        calculateSumAndProduct(matrix);
    }
}
