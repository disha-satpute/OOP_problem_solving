/*Given a number x, determine whether the given number is Armstrong number or not. 
A positive integer of n digits is called an Armstrong number of order n (order is number of digits) if. 
abcd… = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ….*/


import java.lang.*;
import java.util.*;

class Armstrong
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Number");
    int number = sc.nextInt();

   int originalnum,rem,result=0;

    originalnum=number;

    while(originalnum != 0){

        rem=originalnum%10;

        result +=Math.pow(rem,3);

        originalnum /= 10;
    }
    if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}

