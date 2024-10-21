import java.util.Scanner;

public class MultiplyDigits {

    // Method to multiply the digits of a number
    public static int multiplyDigits(int num) {
        int product = 1; // Initialize the product to 1 (since it's multiplication)
        
        // Loop to extract and multiply each digit
        while (num > 0) {
           // int digit = num % 10;  // Extract the last digit
            product *= num%10;      // Multiply the digit with the current product
            num /= 10;             // Remove the last digit from the number
        }

        return product;  // Return the final product of the digits
    }

    public static void main(String[] args) {
        // Create scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Calculate the product of digits
        int product = multiplyDigits(num);

        // Output the result
        System.out.println("The product of the digits is: " + product);
    }
}
