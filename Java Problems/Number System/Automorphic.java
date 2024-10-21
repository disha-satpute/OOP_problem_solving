
import java.lang.*;
import java.util.*;

public class Automorphic {


    public static boolean isAutomorphic(int num) {
        int square = num * num;

        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);

        return squareStr.endsWith(numStr);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isAutomorphic(num))
        {
            System.out.println(num + " is an Automorphic number.");
        } 
        else {
            System.out.println(num + " is not an Automorphic number.");
        }

    }
}