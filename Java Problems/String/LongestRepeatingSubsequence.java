public class LongestRepeatingSubsequence {
    public static void main(String[] args) {
        String str = "aabb"; // Example input
        int result = longestRepeatingSubsequence(str);
        System.out.println("Length of the longest repeating subsequence is: " + result);
    }

    public static int longestRepeatingSubsequence(String str) {
        int n = str.length();
        
        // Create a 2D array to store lengths of longest repeating subsequence
        int[][] dp = new int[n + 1][n + 1];

        // Build the dp array
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // If characters match and are not at the same position
                if (str.charAt(i - 1) == str.charAt(j - 1) && i != j) {
                    dp[i][j] = dp[i - 1][j - 1] + 1; // Include this character
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); // Exclude this character
                }
            }
        }

        // The bottom-right cell will contain the length of the longest repeating subsequence
        return dp[n][n];
    }
}
