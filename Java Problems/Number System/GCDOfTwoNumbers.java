import java.util.Scanner;

public class GCDOfTwoNumbers {

    // Method to compute GCD of two numbers using the Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to input two numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Find the GCD of the two numbers
        int gcd = gcd(num1, num2);

        // Output the result
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}
