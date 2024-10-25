public class MedianOfMatrix {
    private static int countLessEqual(int[][] matrix, int x) {
        int count = 0;
        int R = matrix.length;
        int C = matrix[0].length;

        int row = R - 1;
        int col = 0;


        while (row >= 0 && col < C) {
            if (matrix[row][col] <= x) {
                count += (row + 1);
                col++;
            } else {
                row--;
            }
        }

        return count;
    }

    public static int findMedian(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        int totalElements = R * C;

        int left = matrix[0][0];
        int right = matrix[R - 1][C - 1];
        int desiredCount = totalElements / 2; 

        while (left < right) {
            int mid = left + (right - left) / 2; 
            int count = countLessEqual(matrix, mid);

            if (count <= desiredCount) {
                left = mid + 1; 
            } else {
                right = mid;
            }
        }

        return left; // This will be the median
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17}
        };

        int median = findMedian(matrix);
        System.out.println("Median of the matrix: " + median); // Output: 9
    }
}
