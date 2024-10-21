import java.util.Scanner;

public class FloydTriangle {

    public static void main(String[] args) {
        // Create scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to input the number of rows
        System.out.print("Enter the number of rows for Floyd's Triangle: ");
        int rows = sc.nextInt();

        // Initialize the starting number
        int number = 1;

        // Outer loop to handle the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;  // Increment the number for the next position
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
