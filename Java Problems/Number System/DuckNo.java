/*Find out whether a given number is a Duck number or not.
 A Duck number is a number which has zeroes present in it, but there should be no zero present in the beginning of the number. */

import java.util.*;

class DuckNo{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num= sc.nextInt();
         int i = 0, n = num.length();
        while (i < n && num.charAt(i) == '0')
            i++;
 
        // Check remaining digits
        while (i < n) {
            if (num.charAt(i) == '0')
                return true;
            i++;
        }
        

        System.out.println("Factorial of "+num+":"+fact);
    }
}