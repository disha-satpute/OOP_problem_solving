public class immutable {
    public static void main(String[] args) {
        // Create an immutable string
        String originalString = "Welcome to JAVA!";

        // Try to modify the string
        String modifiedString = originalString.replace("JAVA", "PYTHON");

        // Print both strings to show immutability
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);

        // Check if original string is unchanged
        if (originalString == modifiedString) {
            System.out.println("The original string is mutable.");
        } else {
            System.out.println("The original string is immutable.");
        }
    }
}
