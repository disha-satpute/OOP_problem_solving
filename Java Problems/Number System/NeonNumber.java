import java.util.Scanner;

public class NeonNumber {

    // Method to calculate the sum of digits of a number
    public static int sumOfDigits(int num) {
        int sum = 0;

        // Loop to extract and sum each digit of the number
        while (num > 0) {
            sum += num % 10;  // Add the last digit to the sum
            num /= 10;        // Remove the last digit
        }

        return sum;  // Return the sum of digits
    }

    // Method to check if the number is a Neon number
    public static boolean isNeon(int num) {
        int square = num * num;          // Square the number
        int sum = sumOfDigits(square);   // Find the sum of digits of the square

        // Check if the sum of the digits of the square is equal to the original number
        return (sum == num);
    }

    // Method to find and print all Neon numbers in a given range
    public static void findNeonNumbersInRange(int start, int end) {
        System.out.println("Neon numbers between " + start + " and " + end + ":");
        
        for (int i = start; i <= end; i++) {
            if (isNeon(i)) {
                System.out.println(i + " is a Neon number.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Check if a single number is a Neon number
        System.out.print("Enter a number to check if it is a Neon number: ");
        int num = sc.nextInt();

        if (isNeon(num)) {
            System.out.println(num + " is a Neon number.");
        } else {
            System.out.println(num + " is not a Neon number.");
        }

        // Find all Neon numbers within a range
        System.out.print("\nEnter the start of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();

        findNeonNumbersInRange(start, end);
    }
}
