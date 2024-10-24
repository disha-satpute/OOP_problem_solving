import java.util.Arrays;

public class UnionOfArrays {

    
    public static int findUnion(int[] a, int[] b) {
   
        int n = a.length;
        int m = b.length;
        int[] merged = new int[n + m];
        
  
        System.arraycopy(a, 0, merged, 0, n);

        System.arraycopy(b, 0, merged, n, m);


        Arrays.sort(merged);


        int uniqueCount = 0;

        for (int i = 0; i < merged.length; i++) {
            if (i == 0 || merged[i] != merged[i - 1]) {
                uniqueCount++;
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {3, 4, 5, 5, 6};
        int result = findUnion(a, b);
        System.out.println("Number of unique elements in the union: " + result);
    }
}
