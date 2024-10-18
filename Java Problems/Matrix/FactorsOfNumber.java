import java.util.Scanner;

public class FactorsOfNumber {

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Factors of " + num + " are:");

        // Iterate from 1 to the number
        for (int i = 1; i <= num; i++) {
            // Check if 'i' is a factor of the number
            if (num % i == 0) {
                System.out.println(i); // Print the factor
            }
        }
    }
}
