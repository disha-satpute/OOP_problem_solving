public class DivideWithoutOperators {
    public static int divide(int a, int b) {
        if (b == 0) return Integer.MAX_VALUE;  
        int result = 0;
        int sign = (a < 0) ^ (b < 0) ? -1 : 1;
        a = Math.abs(a);
        b = Math.abs(b);

        while (a >= b) {
            a -= b;
            result++;
        }

        return sign * result;
    }

    public static void main(String[] args) {
        int a = 10, b = 3;  
        System.out.println("Quotient: " + divide(a, b));
    }
}
