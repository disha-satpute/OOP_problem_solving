/* Chef appeared for a placement test. There is a problem worth X points. 
Chef finds out that the problem has exactly 10 test cases. 
It is known that each test case is worth the same number of points.
Chef passes N test cases among them. Determine the score Chef will get.*/

import java.util.*;
import java.lang.*;

class TestCase{
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

     System.out.println("Problem Worth of how much Points");
     int point = sc.nextInt();

     System.out.println("Total test Cases = 10\n");

      int equ = point/10;

     System.out.println("The Number of Test Cases Solved");
     int score = sc.nextInt();

    System.out.println("Score is :"+(equ*score));

     }
}