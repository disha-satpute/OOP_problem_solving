//Find if the given number is a Ugly number or not. A number is said to be an Ugly number if positive numbers whose prime factors only include 2, 3, 5.

import java.util.Scanner;

public class UglyNumberChecker {

    // Function to check if a number is an Ugly number
    public static boolean isUgly(int number) {
        if (number <= 0) {
            return false; // Ugly numbers are positive
        }

        // Divide by 2, 3, and 5 repeatedly
        while (number % 2 == 0) {
            number /= 2;
        }
        while (number % 3 == 0) {
            number /= 3;
        }
        while (number % 5 == 0) {
            number /= 5;
        }

        // If the resulting number is 1, it's an Ugly number
        return number == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is an Ugly number
        if (isUgly(number)) {
            System.out.println(number + " is an Ugly Number.");
        } else {
            System.out.println(number + " is not an Ugly Number.");
        }

        scanner.close();
    }
}
