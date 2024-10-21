import java.util.Arrays;
import java.util.HashSet;

public class UniquePermutations {
    public static void main(String[] args) {
        String str = "abc"; // Example input
        char[] chars = str.toCharArray();
        Arrays.sort(chars); // Sort the characters to ensure lexicographical order
        boolean[] used = new boolean[chars.length];
        StringBuilder currentPermutation = new StringBuilder();
        HashSet<String> result = new HashSet<>(); // To store unique permutations

        generatePermutations(chars, used, currentPermutation, result);
        
        // Print results
        System.out.println("Unique permutations in lexicographical order:");
        result.stream().sorted().forEach(System.out::println);
    }

    public static void generatePermutations(char[] chars, boolean[] used, 
                                             StringBuilder currentPermutation, HashSet<String> result) {
        // Base case: if the current permutation is of the same length as the original string
        if (currentPermutation.length() == chars.length) {
            result.add(currentPermutation.toString());
            return;
        }
        
        for (int i = 0; i < chars.length; i++) {
            if (used[i]) continue; // Skip if already used
            
            // Check for duplicates: only allow the first occurrence of the character in this position
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) {
                continue; // Skip duplicates
            }

            used[i] = true; // Mark as used
            currentPermutation.append(chars[i]); // Include this character
            generatePermutations(chars, used, currentPermutation, result); // Recur
            used[i] = false; // Backtrack
            currentPermutation.deleteCharAt(currentPermutation.length() - 1); // Remove the last character
        }
    }
}
