/*Find out whether a given number is a Duck number or not.
 A Duck number is a number which has zeroes present in it, but there should be no zero present in the beginning of the number. */


 import java.util.*;

 class DuckNo {
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter a Number:");
         String num = sc.next();  // Treating the input as a String to check for Duck number
 
         // Check if the number is a Duck number
         boolean isDuck = false;
         int i = 0;
 
         // Skip leading zeros
         while (i < num.length() && num.charAt(i) == '0') {
             i++;
         }
 
         // Check for a zero after skipping leading zeros
         while (i < num.length()) {
             if (num.charAt(i) == '0') {
                 isDuck = true;  // Found a zero, hence it is a Duck number
                 break;
             }
             i++;
         }
 
         if (isDuck) {
             System.out.println(num + " is a Duck number.");
         } else {
             System.out.println(num + " is not a Duck number.");
         }
     }
 }
 