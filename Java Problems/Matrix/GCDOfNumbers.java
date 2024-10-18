import java.util.Scanner;

public class GCDOfNumbers {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findGCD(int[] numbers) {
        int result = numbers[0]; // Start with the first number
        for (int i = 1; i < numbers.length; i++) {
            result = gcd(result, numbers[i]);
            if (result == 1) { // Early exit if GCD becomes 1, as it's the smallest possible GCD
                return 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user for the number of integers they want to input
        System.out.print("Enter the number of integers: ");
        int n = sc.nextInt();

        // Create an array to hold the integers
        int[] numbers = new int[n];

        // Take input from the user
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Find the GCD of the array of numbers
        int gcd = findGCD(numbers);

        // Output the result
        System.out.println("GCD of the given numbers is: " + gcd);
    }
}
