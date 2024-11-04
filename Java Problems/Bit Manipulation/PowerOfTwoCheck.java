public class PowerOfTwoCheck {
    public static boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        int n = 16;  // Example input
        System.out.println("Is power of 2: " + isPowerOfTwo(n));
    }
}
