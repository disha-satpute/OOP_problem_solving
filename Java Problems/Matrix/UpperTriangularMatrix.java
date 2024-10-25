public class UpperTriangularMatrix {
    public static void printUpperTriangular(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("Upper Triangular Matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (i <= j) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("0 "); 
                }
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        printUpperTriangular(matrix);
    }
}
