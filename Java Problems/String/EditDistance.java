public class EditDistance {
    public static void main(String[] args) {
        String s = "horse"; // Example input
        String t = "ros";
        int result = minDistance(s, t);
        System.out.println("Minimum operations required: " + result);
    }

    public static int minDistance(String s, String t) {
        int m = s.length();
        int n = t.length();
        
        // Create a DP table
        int[][] dp = new int[m + 1][n + 1];

        // Initialize base cases
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i; // Deleting all characters of s
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j; // Inserting all characters of t
        }

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // Characters match, no operation needed
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j] + 1, // Deletion
                                       Math.min(dp[i][j - 1] + 1, // Insertion
                                                dp[i - 1][j - 1] + 1)); // Replacement
                }
            }
        }

        return dp[m][n]; // Minimum operations to convert s to t
    }
}
