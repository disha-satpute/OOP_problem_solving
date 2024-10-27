import java.util.Scanner;

public class NivenNumber {

    public static int sumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }


    public static boolean isNiven(int num) {
        int sum = sumOfDigits(num);

        return (num % sum == 0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isNiven(num)) {
            System.out.println(num + " is a Niven number.");
        } else {
            System.out.println(num + " is not a Niven number.");
        }
    }
}
