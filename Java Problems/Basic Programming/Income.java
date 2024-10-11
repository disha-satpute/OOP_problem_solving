/*In Chefland, a tax of rupees 10 is deducted if the total income is strictly greater than rupees 100.
  Given that total income is X rupees, find out how much money you get.*/

  import java.util.*;
import java.lang.*;

class Income{
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

     System.out.println("Total Income");
     int income = sc.nextInt();
     if(income>
     100){
        int total = income-10;
         System.out.println("Money you get :"+total);
     }
     else{
         System.out.println("Money you get :"+income);
     }
     }
}