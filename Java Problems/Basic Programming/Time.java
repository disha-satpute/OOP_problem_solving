/*Chef has recently moved into an apartment. It takes 30 minutes for Chef to reach office from the apartment. 
Chef left for the office X minutes before Chef was supposed to reach. Determine whether or not Chef will be able to reach on time.*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Time
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int T=0 ;T<n;n--)
		{
		    int X=sc.nextInt();
		    if(X>=30){
		        System.out.println("YES\n");
		    }
		    else{
		        System.out.println("NO\n");
		    }
		    
		}

	}
}