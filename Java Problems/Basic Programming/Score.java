/*Chef took an examination two times. In the first attempt, he scored X marks while in the second attempt he scored Y marks.
 According to the rules of the examination, the best score out of the two attempts will be considered as the final score. Determine the final score of the Chef.*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Score

{
		public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int T=0 ;T<n;n--)
		{
		    int X=sc.nextInt();
		    int Y = sc.nextInt();
		    
		   if(X>Y){
		       System.out.println(X);
		   }
		    
		 else{
		     System.out.println(Y);
		 }
		}

	}
}
