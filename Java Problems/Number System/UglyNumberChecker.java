//Find if the given number is a Ugly number or not. A number is said to be an Ugly number if positive numbers whose prime factors only include 2, 3, 5.

import java.util.Scanner;

public class UglyNumberChecker {


    public static boolean isUgly(int number) {
        if (number <= 0) {
            return false;
        }

        while (number % 2 == 0) {
            number /= 2;
        }
        while (number % 3 == 0) {
            number /= 3;
        }
        while (number % 5 == 0) {
            number /= 5;
        }

        return number == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isUgly(number)) {
            System.out.println(number + " is an Ugly Number.");
        } else {
            System.out.println(number + " is not an Ugly Number.");
        }

        scanner.close();
    }
}
