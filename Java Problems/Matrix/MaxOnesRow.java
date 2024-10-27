public class MaxOnesRow {
    // Function to find the first row with the maximum number of 1's
    public static int rowWithMax1s(int[][] matrix) {
        int n = matrix.length; 
        if (n == 0) return -1;
        int m = matrix[0].length; 

        int maxRowIndex = -1;
        int maxCount = 0; 

        for (int i = 0; i < n; i++) {

            int low = 0;
            int high = m - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (matrix[i][mid] == 1) { 
                   
                    high = mid - 1;
                } else {
 
                    low = mid + 1;
                }
            }


            int count = m - low;

    
            if (count > maxCount) {
                maxCount = count;
                maxRowIndex = i;
            }
        }

        return maxRowIndex; 
    }

    public static void main(String[] args) {
        int[][] matrix = { 
            {0, 0, 1, 1},
            {0, 1, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 0}
        };

        int result = rowWithMax1s(matrix);
        System.out.println("The first row with maximum number of 1's is: " + result); // Output: 2
    }
}
