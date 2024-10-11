import java.util.*;
import java.lang.*;

class calculator{

    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n.4.Division");
    int ch = sc.nextInt();

    switch(ch){
         case 1:
            System.out.println("Enter Number 1");
            int num1 = sc.nextInt();
            System.out.println("Enter Number 2");
            int num2 = sc.nextInt();
             System.out.println("Addition :"+(num1+num2));
            break;

            case 2:
            System.out.println("Enter Number 1");
            int num11 = sc.nextInt();
            System.out.println("Enter Number 2");
            int num21 = sc.nextInt();
             System.out.println("Subtraction :"+(num11-num21));
            break;

            case 3:
            System.out.println("Enter Number 1");
            int num12 = sc.nextInt();
            System.out.println("Enter Number 2");
            int num22 = sc.nextInt();
             System.out.println("Multiplication :"+(num12*num22));
            break;

            case 4:
            System.out.println("Enter Number 1");
            int num13 = sc.nextInt();
            System.out.println("Enter Number 2");
            int num23 = sc.nextInt();
             System.out.println("Devision :"+(num13/num23));
            break;

            default :
            System.out.println("Enter Valid Choice")
            break;9
    }}
}