/*Given an array of N integers and an integer K,
find the number of pairs of elements in the array whose sum is equal to K. */

public class PairSum {

    // Function to count pairs whose sum equals K
    public static int countPairs(int[] arr, int K) {
        int count = 0;

        // Iterate through each pair
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == K) {
                    count++;  // If the pair sum is equal to K, increment the count
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int K = 6;
        System.out.println("Number of pairs with sum " + K + ": " + countPairs(arr, K));
    }
}
