public class XORFromOneToN {
    public static int xorFromOneToN(int n) {
        if (n % 4 == 0) return n;
        if (n % 4 == 1) return 1;
        if (n % 4 == 2) return n + 1;
        return 0;
    }

    public static void main(String[] args) {
        int n = 5;  // Example input
        System.out.println("XOR from 1 to " + n + " is: " + xorFromOneToN(n));
    }
}
