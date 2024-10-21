
import java.util.Scanner;

public class DisariumNumberChecker {

    // Function to check if a number is a Disarium number
    public static boolean isDisarium(int number) {
        int sum = 0;
        String numStr = Integer.toString(number);
        // Calculate the sum of digits raised to the power of their positions
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i)); // Get the digit
            sum += Math.pow(digit, i + 1); // Raise to the power of (i + 1)
        }

        // Check if the sum equals the original number
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a Disarium number
        if (isDisarium(number)) {
            System.out.println(number + " is a Disarium Number.");
        } else {
            System.out.println(number + " is not a Disarium Number.");
        }

        scanner.close();
    }
}
