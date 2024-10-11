import java.util.*;

class Fibonacci {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 2 numbers :");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.print(num1 + " ");
        System.out.print(num2 + " ");

        for (int i = 0; i < 5; i++) {

            int num3 = num1 + num2;

            System.out.print(num3 + " ");

            num1 = num2;
            num2 = num3;

        }
    }
}