// Move all negative numbers to beginning and positive to end with constant extra space

public class RearrangeArray {
    public static void rearrange(int[] arr) {
        int left = 0; 
        int right = 0; 

        while (right < arr.length) {
            if (arr[right] < 0) {

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
            right++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, -7, 5, -3, 8, -1, 6};
        rearrange(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Output : [-7, -3, -1, 5, 8, 12, 6] 
    }
}