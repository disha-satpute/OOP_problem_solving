import java.util.Scanner;

public class FloydTriangleLetters {

    public static void main(String[] args) {
        // Create scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user for the number of rows in Floyd's Triangle
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        char letter = 'A';  // Starting letter

        // Loop to print each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print letters in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(letter + " ");
                letter++;  // Move to the next letter in the alphabet
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
