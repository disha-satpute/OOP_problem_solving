import java.util.Scanner;

public class HappyNumber {

    public static boolean isHappy(int num) {
        int slow = num;
        int fast = num;

        do {
            slow = sumOfSquares(slow);  // Move slow pointer 
            fast = sumOfSquares(sumOfSquares(fast));  // Move fast pointer 
        } while (slow != fast);  // Loop until both pointers meet

        return slow == 1;  // If the loop ends because slow == 1, it is a happy number
    }

    // Method to calculate the sum of squares of digits
    public static int sumOfSquares(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;  
            sum += digit * digit;
            num /= 10;
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
