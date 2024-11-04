public class SetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Count of set bits: " + countSetBits(n));
    }
}
