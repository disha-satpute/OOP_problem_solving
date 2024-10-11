/*Find out the Factorial of a given number.*/

import java.util.*;

class Factorial{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num= sc.nextInt();
        int fact=1,i;

        for(i=1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+num+":"+fact);
    }
}