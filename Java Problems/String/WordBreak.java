import java.util.HashSet;
import java.util.Set;

public class WordBreak {
    public static void main(String[] args) {
        String A = "leetcode"; // Example input string
        String[] B = {"leet", "code"}; // Example dictionary
        boolean canSegment = wordBreak(A, B);
        System.out.println("Can the string be segmented? " + canSegment);
    }

    public static boolean wordBreak(String A, String[] B) {
        Set<String> wordDict = new HashSet<>();
        for (String word : B) {
            wordDict.add(word);
        }

        int n = A.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true; 

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                // Check if the substring A[j:i] is in the dictionary
                if (dp[j] && wordDict.contains(A.substring(j, i))) {
                    dp[i] = true;
                    break; // No need to check further if we found a valid segmentation
                }
            }
        }

        return dp[n]; // Return whether the entire string can be segmented
    }
}

