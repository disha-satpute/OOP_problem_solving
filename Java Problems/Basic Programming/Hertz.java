/*Chef's dog binary hears frequencies starting from 67 Hertz to 45000 Hertz (both inclusive). 
 If Chef's commands have a frequency of X Hertz, find whether binary can hear them or not.*/

import java.util.*;
import java.lang.*;

class Hertz{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hertz");
        int Hr = sc.nextInt();

        if((Hr>=67) && (Hr<=45000))
        {
       System.out.println("YES");
       }
       else{
        System.out.println("NO");
        }
    }
}