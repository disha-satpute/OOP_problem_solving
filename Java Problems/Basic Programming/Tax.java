/* In Chefland, everyone who earns strictly more than Y rupees per year, has to pay a tax to Chef.
Chef has allowed a special scheme where you can invest any amount of money and claim exemption for it. 
You have earned X (X>Y) rupees this year.
Find the minimum amount of money you have to invest so that you don't have to pay taxes this year. */

 import java.util.*;
 import java.lang.*;

class Tax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

         System.out.println("How Much Amout You Earn");
         int amount = sc.nextInt();

         System.out.println("amount for have to pay taxes");
         int tax = sc.nextInt();
           if(amount>tax)
         System.out.println("Minimum Amount You have to Invest :"+(amount-tax));
           else
         System.out.println("No need to Invest");
    }
 }