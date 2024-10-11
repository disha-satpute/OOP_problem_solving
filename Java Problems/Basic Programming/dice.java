/* Chef and Chefina are playing with dice. In one turn, both of them roll their dice at once. They consider a turn to be good if the sum of 
the numbers on their dice is greater than 6. Given that in a particular turn Chef and Chefina got X and Y on their respective dice, 
find whether the turn was good. */

import java.util.*;
import java.lang.*;
import java.io.*;


class dice
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Chef Turn");
		int X = sc.nextInt();
        System.out.println("Chefina Turn");
        int Y = sc.nextInt();
		
		if( (X+Y) > 6 ){
            
            System.out.println("This is a Good Turn..!!");
        }
		else{
			System.out.println("Roll dice again");
		}
		
	}
}
