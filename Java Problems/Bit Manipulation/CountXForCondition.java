public class CountXForCondition {
    public static int countX(int n) {
        int unsetBits = 0;
        while (n > 0) {
            if ((n & 1) == 0) unsetBits++;
            n >>= 1;
        }
        return 1 << unsetBits;
    }

    public static void main(String[] args) {
        int n = 5; 
        System.out.println("Count of x for n + x = n ^ x: " + countX(n));
    }
}
