public class DuplicateCharacters {
    public static void main(String[] args) {
        String input = "programming";
        printDuplicates(input);
    }

    public static void printDuplicates(String str) {
        // Convert the string to a character array
        char[] chars = str.toCharArray();
        int[] counts = new int[256]; // Assuming ASCII characters

        // Count occurrences of each character
        for (char c : chars) {
            counts[c]++;
        }

        // Print duplicates and their counts
        System.out.println("Duplicate characters and their counts:");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 1) {
                System.out.println((char) i + ": " + counts[i]);
            }
        }
    }
}
