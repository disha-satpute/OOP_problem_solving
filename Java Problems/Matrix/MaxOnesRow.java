public class MaxOnesRow {
    // Function to find the first row with the maximum number of 1's
    
    public static int rowWithMax1s(int[][] matrix) {
        int n = matrix.length; // Number of rows
        if (n == 0) return -1; // Handle empty matrix case
        int m = matrix[0].length; // Number of columns

        int maxRowIndex = -1; // To store index of the row with max 1's
        int maxCount = 0; // To store the maximum count of 1's found

        for (int i = 0; i < n; i++) {
            // Use binary search to find the first occurrence of 1
            int low = 0;
            int high = m - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (matrix[i][mid] == 1) { // Compare with 1
                    // If we find a 1, search towards the left
                    high = mid - 1;
                } else {
                    // If we find a 0, search towards the right
                    low = mid + 1;
                }
            }

            // Count of 1's in this row
            int count = m - low;

            // Update maxCount and maxRowIndex if this row has more 1's
            if (count > maxCount) {
                maxCount = count;
                maxRowIndex = i;
            }
        }

        return maxRowIndex; // Return the index of the row with maximum 1's
    }

    public static void main(String[] args) {
        int[][] matrix = { // Change to int[][] and use 0 and 1
            {0, 0, 1, 1},
            {0, 1, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 0}
        };

        int result = rowWithMax1s(matrix);
        System.out.println("The first row with maximum number of 1's is: " + result); // Output: 2
    }
}
