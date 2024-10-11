import java.util.*;
import java.lang.*;

class Sample{

    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

     
     for(int k = 0;k<10;k++){

    System.out.println("\n\n1.Check Even or Odd\n2.Addition of 1 to 10\n3.Table of 8\n4.Exit");
    int ch = sc.nextInt();

    switch(ch){

         case 1:

            System.out.println("Enter Number");
            int num1 = sc.nextInt();
             if(num1%2==0){
                System.out.println("This Number is Even");
             }
             else{
              System.out.println("This Number is Odd");
             }

            break;

            case 2:

                int i =0;
                int sum=0;
           while(i<=10)
           {
              sum =sum+i;
            
            i++;
           }
           System.out.println("Addition of first 10 numbers :"+sum);

            break;


            case 3:

            for(int j=1;j<=10;j++){
                int table = 8*j;
                 System.out.println(table);
            }

            break;

            case 4:

                System.out.println("Thank You");

            break;

            default :

            System.out.println("Enter Valid Choice");

            break;
       }
    }
  
   }
}