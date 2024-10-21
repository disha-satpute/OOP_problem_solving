import java.util.Scanner;

public class HarshadNumber {

    // Method to calculate the sum of digits of a number
    public static int sumOfDigits(int num) {
        int sum = 0;
        // Loop to extract and sum each digit of the number
        while (num > 0) {
            sum += num % 10;  // Add the last digit to sum
            num /= 10;        // Remove the last digit from the number
        }
        return sum;  // Return the total sum of digits
    }

    // Method to check if the number is a Harshad number
    public static boolean isHarshad(int num) {
        int sum = sumOfDigits(num);  // Get the sum of digits
        
        // Check if the number is divisible by the sum of its digits
        return (num % sum == 0);
    }

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if the number is a Harshad number
        if (isHarshad(num)) {
            System.out.println(num + " is a Harshad number.");
        } else {
            System.out.println(num + " is not a Harshad number.");
        }
    }
}
