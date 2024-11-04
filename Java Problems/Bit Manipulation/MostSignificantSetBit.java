public class MostSignificantSetBit {
    public static int findMSB(int n) {
        int msb = 0;
        while (n > 1) {
            n >>= 1;
            msb++;
        }
        return 1 << msb;
    }

    public static void main(String[] args) {
        int n = 18;  // Example input
        System.out.println("Most significant set bit: " + findMSB(n));
    }
}
