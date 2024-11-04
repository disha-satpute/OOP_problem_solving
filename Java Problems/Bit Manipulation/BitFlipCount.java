public class BitFlipCount {
    public static int countBitsToFlip(int a, int b) {
        int xor = a ^ b;
        int count = 0;
        while (xor > 0) {
            count += xor & 1;
            xor >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int a = 29, b = 15;  // Example input
        System.out.println("Number of bits to flip: " + countBitsToFlip(a, b));
    }
}
