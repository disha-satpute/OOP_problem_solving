import java.util.Scanner;

public class PronicNumberChecker {

    // Function to check if a number is a Pronic number
    public static boolean isPronic(int number) {
        for (int n = 0; n * (n + 1) <= number; n++) {
            if (n * (n + 1) == number) {
                return true; // Found a pronic number
            }
        }
        return false; // Not a pronic number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a Pronic number
        if (isPronic(number)) {
            System.out.println(number + " is a Pronic Number.");
        } else {
            System.out.println(number + " is not a Pronic Number.");
        }

        scanner.close();
    }
}
