import java.util.Scanner;

public class NeonNumber {

    public static int sumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = sumOfDigits(square);


        return (sum == num);
    }

    public static void findNeonNumbersInRange(int start, int end) {
        System.out.println("Neon numbers between " + start + " and " + end + ":");
        
        for (int i = start; i <= end; i++) {
            if (isNeon(i)) {
                System.out.println(i + " is a Neon number.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a Neon number: ");
        int num = sc.nextInt();

        if (isNeon(num)) {
            System.out.println(num + " is a Neon number.");
        } else {
            System.out.println(num + " is not a Neon number.");
        }


        System.out.print("\nEnter the start of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();

        findNeonNumbersInRange(start, end);
    }
}
