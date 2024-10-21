import java.util.Scanner;

public class MagicNumberChecker {

    // Function to check if a number is a magic number
    public static boolean isMagicNumber(int number) {
        // Function to calculate the sum of digits
        int sum = number;
        
        // Repeat until we get a single digit
        while (sum > 9) {
            int tempSum = 0;
            while (sum > 0) {
                tempSum += sum % 10; // Add the last digit
                sum /= 10;           // Remove the last digit
            }
            sum = tempSum; // Update sum to the new sum of digits
        }

        // Check if the final single digit is 1
        return sum == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a magic number
        if (isMagicNumber(number)) {
            System.out.println(number + " is a Magic Number.");
        } else {
            System.out.println(number + " is not a Magic Number.");
        }

        scanner.close();
    }
}
