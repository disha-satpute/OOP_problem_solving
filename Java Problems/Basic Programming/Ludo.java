/* Chef is playing Ludo. According to the rules of Ludo, a player can enter a new token into the play only when 
he rolls a 6 on the die. In the current turn, Chef rolled the number X on the die. 
Determine if Chef can enter a new token into the play in the current turn or not. */

 import java.util.*;
 import java.lang.*;

 class Ludo{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

    for (int i=0; i<4; i++)
{
        System.out.print("\n"+"Enter Your Turn :");
        int x = sc.nextInt();

        if (x==6){
            System.out.println(" enter into the play");
        }
        else{
             System.out.println(" Can't enter into the play");
        }
}
    }
 }