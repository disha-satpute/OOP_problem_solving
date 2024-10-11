/*There is a cricket match going on between two teams A and B. Team B is batting second and got a target of X runs. 
Currently, team B has scored Y runs. Determine how many more runs Team B should score to win the match. 
Note: The target score in cricket matches is one more than the number of runs scored by the team that batted first.*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Cricket
{
	
		public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int T=0 ;T<n;n--)
		{
		    int X=sc.nextInt();
		    int Y = sc.nextInt();
		    
		    System.out.println(X-Y);
		    
		}

	}

	
}
