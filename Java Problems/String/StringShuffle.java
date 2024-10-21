public class StringShuffle {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String s3 = "adbcef"; // valid shuffle
        String s4 = "abcdef"; // not a valid shuffle

        System.out.println(s3 + " is a valid shuffle: " + isValidShuffle(s1, s2, s3));
        System.out.println(s4 + " is a valid shuffle: " + isValidShuffle(s1, s2, s4));
    }

    public static boolean isValidShuffle(String s1, String s2, String s3) {
        // Check if lengths match
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }

        
        int i = 0, j = 0;

       
        for (char c : s3.toCharArray()) {
            if (i < s1.length() && c == s1.charAt(i)) {
                i++; 
            } else if (j < s2.length() && c == s2.charAt(j)) {
                j++; 
            } else {
                return false; 
            }
        }

        // If we consumed all characters from s1 and s2
        return i == s1.length() && j == s2.length();
    }
}
