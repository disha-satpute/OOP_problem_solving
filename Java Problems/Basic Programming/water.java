/*Recently, Chef visited his doctor. The doctor advised Chef to drink at least 2000 ml of water each day.
 Chef drank X ml of water today. Determine if Chef followed the doctor's advice or not.*/ 

import java.util.*;
import java.lang.*;

class water{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("How much water drank today (in ml)");
        int ml = sc.nextInt();

        if(ml>=2000)
        {
         System.out.println("followed Doctor's Advice");
        }
        else
        {
        System.out.println("Not followed Doctor's Advice");
        }
    }
}