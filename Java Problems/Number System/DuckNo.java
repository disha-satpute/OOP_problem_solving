/*Find out whether a given number is a Duck number or not.
 A Duck number is a number which has zeroes present in it, but there should be no zero present in the beginning of the number. */

 import java.util.*;
 class DuckNo {
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter a Number:");
         String num = sc.next();

         boolean isDuck = false;
      int i = 0;

         // Skip leading zeros
         while (i < num.length() && num.charAt(i) == '0') {
             i++;
         }


         while (i < num.length()) {
             if (num.charAt(i) == '0') {
                 isDuck = true;
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
 