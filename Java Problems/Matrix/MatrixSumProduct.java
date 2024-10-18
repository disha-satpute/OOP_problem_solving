public class MatrixSumProduct {
    public static void calculateSumAndProduct(int[][] matrix) {
        int sum = 0;
        long product = 1; // Use long to handle large products

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];        // Add the element to sum
                product *= matrix[i][j];    // Multiply the element to product
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
