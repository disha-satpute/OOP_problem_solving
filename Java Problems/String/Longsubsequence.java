public class Longsubsequence {
    public static void main(String[] args) {
        String str = "aabb";
        int length = longestRepeatingSubsequence(str);
        System.out.println("Length of the longest repeating subsequence: " + length);
    }

    public static int longestRepeatingSubsequence(String str) {
        int n = str.length();
        int[][] dp = new int[n + 1][n + 1];

        // Build the dp array
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Check if characters match and indexes are different
                if (str.charAt(i - 1) == str.charAt(j - 1) && i != j) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[n][n]; // Return the length of the longest repeating subsequence
    }
}
