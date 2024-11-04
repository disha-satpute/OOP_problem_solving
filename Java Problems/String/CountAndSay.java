public class CountAndSay {
    public static void main(String[] args) {
        int n = 5; // Change this value for different terms
        String result = countAndSay(n);
        System.out.println("The " + n + "th term of the count-and-say sequence is: " + result);
    }

    public static String countAndSay(int n) {
        if (n == 1) return "1"; // Base case

        // Get the (n-1)th term
        String previousTerm = countAndSay(n - 1);
        StringBuilder currentTerm = new StringBuilder();

        // Count and describe the previous term
        int count = 1;
        for (int i = 1; i < previousTerm.length(); i++) {
            if (previousTerm.charAt(i) == previousTerm.charAt(i - 1)) {
                count++; // Increment count if the same digit continues
            } else {
                // Append count and the digit to the current term
                currentTerm.append(count).append(previousTerm.charAt(i - 1));
                count = 1; // Reset count for the new digit
            }
        }

        // Handle the last group of digits
        currentTerm.append(count).append(previousTerm.charAt(previousTerm.length() - 1));

        return currentTerm.toString(); // Return the current term
    }
}
