/*Find out whether a given number is a Buzz Number or not. Buzz number is another special number that ends with the digit 7 or is divisible by 7.*/

import java.util.Scanner;

public class Buzz {

    public static boolean isBuzzNumber(int num) {

        return num % 10 == 7 || num % 7 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isBuzzNumber(num)) {
            System.out.println(num + " is a Buzz number.");
        } else {
            System.out.println(num + " is not a Buzz number.");
        }

    }
}