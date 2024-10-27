
public class max{

    public static int rowWithMaxOnes(boolean[][] matrix) {
        int n = matrix.length; 
        int m = matrix[0].length;
        
        int maxRowIndex = -1;
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
           
            int firstOneIndex = firstOneBinarySearch(matrix[i]);

            if (firstOneIndex != -1) {
                int count = m - firstOneIndex; 

                if (count > maxCount) {
                    maxCount = count;
                    maxRowIndex = i;
                }
            }
        }
        
        return maxRowIndex; 
    }

    private static int firstOneBinarySearch(boolean[] row) {
        int low = 0;
        int high = row.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (row[mid]) { // If we find a 1

                high = mid - 1;
            } else {

                low = mid + 1;
            }
        }

    
        return (low < row.length && row[low]) ? low : -1;
    }

    public static void main(String[] args) {
        boolean[][] matrix = {
            {false, false, true, true},
            {false, true, true, true},
            {true, true, true, true},
            {false, false, false, false}
        };

        int result = rowWithMaxOnes(matrix);
        System.out.println("The first row with the maximum number of 1's is: " + result);
    }
}
