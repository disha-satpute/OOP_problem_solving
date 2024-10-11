/*The working hours of Chef’s kitchen are from X pm to Y pm (1≤X<Y≤12).
 Find the number of hours Chef works.*/

 import java.util.*;
import java.lang.*;

class Hours{
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

     System.out.println("Enter Starting Time & Ending Time");
     int Start=sc.nextInt();
     int End = sc.nextInt();

     System.out.println("Working Hours :"+(End-Start));
     }
}