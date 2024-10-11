/* Our Chef is currently practicing on CodeChef and is a beginner. 
The count of ‘All Problems’ in the Beginner section is X. 
Our Chef has already ‘Attempted’ Y problems among them. How many problems are yet ‘Un-attempted’? */

import java.lang.*;
import java.util.*;

class Beginner{

     public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

    int x = 157;

    for(int i=0;i<=10;i++){
    System.out.println("All Problems :"+x);

    System.out.print("Enter Attempted Problems :");
    int y = sc.nextInt();

    System.out.println("Un-Attempted Problems :"+(x-y)+"\n");

     }
     }
}