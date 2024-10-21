import java.util.ArrayList;
import java.util.List;

public class Subsequences {
    public static void main(String[] args) {
        String str = "abc"; // Example input
        List<String> result = new ArrayList<>();
        generateSubsequences(str, "", result);
        
        System.out.println("Subsequences of \"" + str + "\":");
        for (String subsequence : result) {
            System.out.println(subsequence);
        }
    }

    public static void generateSubsequences(String str, String current, List<String> result) {
        // Base case: if the original string is empty
        if (str.isEmpty()) {
            result.add(current); // Add the current subsequence to the result
            return;
        }
        
        // Exclude the first character and recurse
        generateSubsequences(str.substring(1), current, result);
        
        // Include the first character and recurse
        generateSubsequences(str.substring(1), current + str.charAt(0), result);
    }
}
