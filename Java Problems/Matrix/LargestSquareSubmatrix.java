
//Given a boolean matrix of 0’s and 1’s, find and print the largest square sub-matrix whose all the entries are 1.

public class LargestSquareSubmatrix {

    public static void findLargestSquareSubmatrix(int[][] matrix) {
        int n = matrix.length;
        if (n == 0) return;
        int m = matrix[0].length;

        int[][] dp = new int[n][m];
        int maxSize = 0;
        int maxRow = 0;
        int maxCol = 0;

        // Fill the DP table
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1; // First row or first column
                    } else {
                        dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                    }

                    // Update max size and position if we found a larger square
                    if (dp[i][j] > maxSize) {
                        maxSize = dp[i][j];
                        maxRow = i;
                        maxCol = j;
                    }
                }
            }
        }

        // Print the largest square sub-matrix
        if (maxSize == 0) {
            System.out.println("No square sub-matrix of 1's found.");
            return;
        }

        System.out.println("Largest square sub-matrix of 1's:");
        for (int i = maxRow - maxSize + 1; i <= maxRow; i++) {
            for (int j = maxCol - maxSize + 1; j <= maxCol; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 1, 0, 1},
            {1, 1, 1, 1, 0},
            {0, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {0, 0, 1, 0, 0}
        };

        findLargestSquareSubmatrix(matrix);
    }
}
