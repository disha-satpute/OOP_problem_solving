/*Alice and Bob were having an argument about which of them is taller than the other. 
Charlie got irritated by the argument, and decided to settle the matter once and for all. 
Charlie measured the heights of Alice and Bob, and got to know that Alice's height is X centimeters and Bob's height is Y centimeters.
 Help Charlie decide who is taller. It is guaranteed that X≠Y.*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Taller
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int x1=0;x1<T;T--){
		    int x =sc.nextInt();
		     int y =sc.nextInt();
		     
	     if(x>y){
	     System.out.println("A");
		    
		}
		else{
		    System.out.println("B");
		}

	}}
}
