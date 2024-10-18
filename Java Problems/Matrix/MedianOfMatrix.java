public class MedianOfMatrix {
    // Function to count elements less than or equal to x
    private static int countLessEqual(int[][] matrix, int x) {
        int count = 0;
        int R = matrix.length;
        int C = matrix[0].length;

        int row = R - 1; // Start from the last row
        int col = 0;     // Start from the first column

        // Traverse the matrix
        while (row >= 0 && col < C) {
            if (matrix[row][col] <= x) {
                // If the current element is less than or equal to x,
                // all elements above this in the same column are also less than or equal to x
                count += (row + 1);
                col++; // Move to the next column
            } else {
                row--; // Move to the previous row
            }
        }

        return count;
    }

    // Function to find the median of the matrix
    public static int findMedian(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        int totalElements = R * C;

        int left = matrix[0][0]; // Minimum element
        int right = matrix[R - 1][C - 1]; // Maximum element
        int desiredCount = totalElements / 2; // Median index

        while (left < right) {
            int mid = left + (right - left) / 2; // Avoid overflow
            int count = countLessEqual(matrix, mid);

            if (count <= desiredCount) {
                left = mid + 1; // Move to the right
            } else {
                right = mid; // Move to the left
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
