import java.util.Scanner;

public class TechNumberChecker {

    public static boolean isTechNumber(int number) {

        String numStr = Integer.toString(number);
        

        if (numStr.length() % 2 != 0) {
            return false;
        }


        int mid = numStr.length() / 2;


        String leftPart = numStr.substring(0, mid);
        String rightPart = numStr.substring(mid);

        int leftNum = Integer.parseInt(leftPart);
        int rightNum = Integer.parseInt(rightPart);


        int sum = leftNum + rightNum;
        int squareOfSum = sum * sum;


        return squareOfSum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        if (isTechNumber(number)) {
            System.out.println(number + " is a Tech Number.");
        } else {
            System.out.println(number + " is not a Tech Number.");
        }

        scanner.close();
    }
}
