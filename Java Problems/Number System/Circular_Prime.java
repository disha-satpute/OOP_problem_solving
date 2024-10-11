import java.util.Scanner;

public class Circular_Prime {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to rotate the digits of a number
    public static int rotateNumber(int num, int length) {
        int powTen = (int) Math.pow(10, length - 1);
        int firstDigit = num / powTen;
        int rotatedNum = (num % powTen) * 10 + firstDigit;
        return rotatedNum;
    }

    // Function to check if a number is a Circular Prime
    public static boolean isCircularPrime(int num) {
        if (!isPrime(num)) {
            return false;
        }
        
        int length = String.valueOf(num).length();
        int rotatedNum = num;
        
        // Rotate and check all possible permutations
        for (int i = 1; i < length; i++) {
            rotatedNum = rotateNumber(rotatedNum, length);
            if (!isPrime(rotatedNum)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (isCircularPrime(num)) {
            System.out.println(num + " is a Circular Prime number.");
        } else {
            System.out.println(num + " is not a Circular Prime number.");
        }
        
        scanner.close();
    }
}
