
import java.util.Scanner;

public class DisariumNumberChecker {

    public static boolean isDisarium(int number) {
        int sum = 0;
        String numStr = Integer.toString(number);

        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(digit, i + 1);
        }


        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isDisarium(number)) {
            System.out.println(number + " is a Disarium Number.");
        } else {
            System.out.println(number + " is not a Disarium Number.");
        }

        scanner.close();
    }
}
