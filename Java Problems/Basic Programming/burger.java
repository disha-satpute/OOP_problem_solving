/* Chef is fond of burgers and decided to make as many burgers as possible. Chef has A patties and B buns. 
To make 1 burger, Chef needs 1 patty and 1 bun. Find the maximum number of burgers that Chef can make. */

import java.util.*;
import java.lang.*;

class burger{

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("number of patties");
        int A = sc.nextInt();

        System.out.println("number of Buns");
        int B = sc.nextInt();
 
      // logic
      if(A>B){
        System.out.println("Number of burgers chef can make :"+B);
      }
      else{
         System.out.println("Number of burgers chef can make :"+A);
      }
    }
}