/*Given an array of N integers and an integer K, 
find the number of pairs of elements in the array whose sum is equal to K. */

public class pairs {
    public static void main(String[] args) {
       int arr[]={2,3,3,4,2,1,5,6};
       int k= 6;
       int size=arr.length;
        for (int i = 1; i <=size ; i++) {
            for (int j = 1; j <= i+1; j++) {
             if(i+j==k){
                System.out.println(i+" "+j);
             }
            }
        }
    }
}