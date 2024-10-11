/*According to a recent survey, Biryani is the most ordered food. 
Chef wants to learn how to make world-class Biryani from a MasterChef. 
Chef will be required to attend the MasterChef's classes for X weeks, 
and the cost of classes per week is Y coins. 
What is the total amount of money that Chef will have to pay?*/


import java.util.*;
import java.lang.*;

class coins{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many week to be Attend");
        int weeks = sc.nextInt();

        int coins=500;  
       System.out.println("Cost of classes per week is :"+coins+"\n");
       
       int TotalCoins= weeks*coins;

       System.out.println("Total money :"+TotalCoins);
    }
}