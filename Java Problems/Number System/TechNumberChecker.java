import java.util.Scanner;

public class TechNumberChecker {

    // Function to check if a number is a tech number
    public static boolean isTechNumber(int number) {
        // Convert the number to a string
        String numStr = Integer.toString(number);
        
        // Check if the number of digits is even
        if (numStr.length() % 2 != 0) {
            return false;
        }

        // Find the middle index
        int mid = numStr.length() / 2;

        // Split the number into two parts
        String leftPart = numStr.substring(0, mid);
        String rightPart = numStr.substring(mid);

        // Convert parts to integers
        int leftNum = Integer.parseInt(leftPart);
        int rightNum = Integer.parseInt(rightPart);

        // Calculate the sum and square of the sum
        int sum = leftNum + rightNum;
        int squareOfSum = sum * sum;

        // Check if the square of the sum equals the original number
        return squareOfSum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a tech number
        if (isTechNumber(number)) {
            System.out.println(number + " is a Tech Number.");
        } else {
            System.out.println(number + " is not a Tech Number.");
        }

        scanner.close();
    }
}
