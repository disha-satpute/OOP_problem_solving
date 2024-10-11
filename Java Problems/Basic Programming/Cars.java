/*King loves to go on tours with his friends. King has N cars that can seat 5 people each and M cars that can seat 7 people each. 
Determine the maximum number of people that can travel together in these cars.*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Cars
{
   public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("No of test cases");
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int T=0 ;T<n;n--)
		{
			System.out.println("Seats for 5 People");
		    int N=sc.nextInt();
			System.out.println("Seats for 7 People");
		    int M = sc.nextInt();
		    
		    System.out.println((N*5)+(M*7)+" People can travel");
		}

	}
}
