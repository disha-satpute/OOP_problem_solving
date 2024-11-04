public class TotalSetBits {
    public static int countTotalSetBits(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += Integer.bitCount(i);
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Total count of set bits from 1 to " + n + ": " + countTotalSetBits(n));
    }
}
