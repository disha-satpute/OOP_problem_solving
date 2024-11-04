public class PalindromeCheck {
    public static void main(String[] args) {
        String S = "racecar"; // You can change this to test other strings
        if (isPalindrome(S)) {
            System.out.println(S + " is a palindrome.");
        } else {
            System.out.println(S + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String S) {
        int left = 0; // Start pointer
        int right = S.length() - 1; // End pointer

        // Check characters from both ends
        while (left < right) {
            if (S.charAt(left) != S.charAt(right)) {
                return false; // Not a palindrome if characters don't match
            }
            left++; // Move forward from the left
            right--; // Move backward from the right
        }
        return true; // The string is a palindrome
    }
}