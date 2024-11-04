public class MinMaxArray {
    static class Pair {
        int min;
        int max;
    }

    public static Pair getMinMax(int[] arr, int n) {
        Pair minmax = new Pair();
        int i;

        // If the array has an even number of elements, initialize the first pair
        if (n % 2 == 0) {
            minmax.min = Math.min(arr[0], arr[1]);
            minmax.max = Math.max(arr[0], arr[1]);
            i = 2; // Start from the third element
        } else {
            // If odd, initialize the first element as both min and max
            minmax.min = minmax.max = arr[0];
            i = 1; // Start from the second element
        }

        // Compare elements in pairs
        while (i < n - 1) {
            if (arr[i] < arr[i + 1]) {
                minmax.min = Math.min(minmax.min, arr[i]);
                minmax.max = Math.max(minmax.max, arr[i + 1]);
            } else {
                minmax.min = Math.min(minmax.min, arr[i + 1]);
                minmax.max = Math.max(minmax.max, arr[i]);
            }
            i += 2;
        }
        return minmax;
    }

    public static void main(String[] args) {
        int[] arr = {100, 11, 445, 1, 330, 3000};
        Pair minmax = getMinMax(arr, arr.length);
        System.out.println("Minimum element: " + minmax.min);
        System.out.println("Maximum element: " + minmax.max);
    }
}
