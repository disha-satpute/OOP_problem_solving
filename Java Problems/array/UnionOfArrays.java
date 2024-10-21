import java.util.Arrays;

public class UnionOfArrays {

    // Function to find the number of unique elements in the union of two arrays
    public static int findUnion(int[] a, int[] b) {
        // Step 1: Merge the two arrays
        int n = a.length;
        int m = b.length;
        int[] merged = new int[n + m];
        
        // Copy elements from the first array
        System.arraycopy(a, 0, merged, 0, n);
        // Copy elements from the second array
        System.arraycopy(b, 0, merged, n, m);

        // Step 2: Sort the merged array
        Arrays.sort(merged);

        // Step 3: Count unique elements
        int uniqueCount = 0;

        for (int i = 0; i < merged.length; i++) {
            // Count the first element or any element that is different from the previous one
            if (i == 0 || merged[i] != merged[i - 1]) {
                uniqueCount++;
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {3, 4, 5, 5, 6};
        int result = findUnion(a, b);
        System.out.println("Number of unique elements in the union: " + result);
    }
}
