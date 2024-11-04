import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargeFactorial {
    public static List<Integer> factorial(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(1);  // factorial of 0 or 1 is 1

        for (int i = 2; i <= n; i++) {
            multiply(result, i);
        }

        Collections.reverse(result);
        return result;
    }

    private static void multiply(List<Integer> result, int x) {
        int carry = 0;

        for (int i = 0; i < result.size(); i++) {
            int prod = result.get(i) * x + carry;
            result.set(i, prod % 10);  // store last digit
            carry = prod / 10;         // propagate carry
        }

        while (carry > 0) {
            result.add(carry % 10);
            carry /= 10;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + ": " + factorial(n));
    }
}
