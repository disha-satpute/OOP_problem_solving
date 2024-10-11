/* Chef wants to appear in a competitive exam. To take the exam, there are following requirements:
 Minimum age limit is X (i.e. Age should be greater than or equal to X). 
 Age should be strictly less than Y.
 Chef's current Age is A. Find whether he is currently eligible to take the exam or not  */


import java.util.*;
import java.lang.*;
import java.io.*;

class comp_exam{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
          System.out.println("Enter Your Age");
        int a = sc.nextInt();   // Chef's current Age
        int X = 18;
        int Y = 35;


        if((a >= X) && (a < Y)){
            System.out.println("Eligible for Exam");
        }
        else{
              System.out.println("Not Eligible for Exam");
        }
    }
}