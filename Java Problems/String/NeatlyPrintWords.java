import java.util.ArrayList;
import java.util.List;

public class NeatlyPrintWords {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 5, 4}; // Example input: lengths of words
        int K = 7; // Maximum characters per line
        
        printWordsNeatly(nums, K);
    }

    public static void printWordsNeatly(int[] nums, int K) {
        StringBuilder currentLine = new StringBuilder();
        int currentLength = 0;

        for (int i = 0; i < nums.length; i++) {
            // If the line is empty, just add the word
            if (currentLength == 0) {
                currentLine.append(" ".repeat(nums[i])); // Add spaces equivalent to word length
                currentLength += nums[i];
            } else if (currentLength + 1 + nums[i] <= K) {
                // If adding the next word (plus a space) fits in the line
                currentLine.append(" ".repeat(nums[i] + 1)); // Add a space and the word
                currentLength += 1 + nums[i]; // Increment length (1 for space + word length)
            } else {
                // Print the current line and start a new one
                System.out.println(currentLine.toString());
                currentLine = new StringBuilder(" ".repeat(nums[i])); // Start new line
                currentLength = nums[i]; // Reset current length to new word length
            }
        }

        // Print any remaining words in the last line
        if (currentLength > 0) {
            System.out.println(currentLine.toString());
        }
    }
}
