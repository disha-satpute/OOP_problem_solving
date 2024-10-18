import java.util.Scanner;

public class NumberToWords {

    // Array for number words from 0 to 19
    private static final String[] belowTwenty = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", 
        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", 
        "seventeen", "eighteen", "nineteen"
    };

    // Array for tens words
    private static final String[] tens = {
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    // Array for place values (hundreds, thousands, etc.)
    private static final String[] thousands = {
        "", "thousand", "million", "billion"
    };

    // Method to convert a given number to words
    public static String numberToWords(int num) {
        if (num == 0) return "zero";

        int i = 0;
        String words = "";

        // Process number in chunks of three digits (thousands, millions, etc.)
        while (num > 0) {
            if (num % 1000 != 0) {
                words = helper(num % 1000) + thousands[i] + " " + words;
            }
            num /= 1000;
            i++;
        }

        return words.trim();
    }

    // Helper method to convert numbers below 1000 to words
    private static String helper(int num) {
        if (num == 0) return "";
        else if (num < 20) return belowTwenty[num] + " ";
        else if (num < 100) return tens[num / 10] + " " + helper(num % 10);
        else return belowTwenty[num / 100] + " hundred " + helper(num % 100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Number in words: " + numberToWords(num));
    }
}
