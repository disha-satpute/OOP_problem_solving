/*DAIICT college students want to attend an IPL match. A total of N students from the 
college want to go while only M tickets are available for the match.
 Determine how many students won't be able to book tickets.*/

import java.util.*;
import java.lang.*;

class Ticket{
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

     System.out.println("Number of Students");
     int students=sc.nextInt();

     System.out.println("Number of Tickets");
     int tickets=sc.nextInt();

     System.out.println("number of students won't be able to get Tickets:"+(students-tickets));
     }
}