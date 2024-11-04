public class AlternatePatternCheck {
    public static boolean hasAlternatePattern(int n) {
        int pattern = n ^ (n >> 1);
        return (pattern & (pattern + 1)) == 0;
    }

    public static void main(String[] args) {
        int n = 42;  // Example input (binary 101010)
        System.out.println("Has alternate pattern: " + hasAlternatePattern(n));
    }
}
