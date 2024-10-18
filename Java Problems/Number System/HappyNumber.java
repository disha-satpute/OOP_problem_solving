import java.util.Scanner;

public class HappyNumber {

    public static boolean isHappy(int num) {
        int slow = num;
        int fast = num;

        do {
            slow = sumOfSquares(slow);  // Move slow pointer by one step
            fast = sumOfSquares(sumOfSquares(fast));  // Move fast pointer by two steps
        } while (slow != fast);  // Loop until both pointers meet

        return slow == 1;  // If the loop ends because slow == 1, it is a happy number
    }

    // Method to calculate the sum of squares of digits
    public static int sumOfSquares(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;  // Extract the last digit
            sum += digit * digit;  // Square the digit and add to sum
            num /= 10;  // Remove the last digit from the number
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isHappy(num)) {
            System.out.println(num + " is a Happy number.");
        } else {
            System.out.println(num + " is not a Happy number.");
        }
    }
}
