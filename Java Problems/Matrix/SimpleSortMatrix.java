import java.util.Arrays;

public class SimpleSortMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 1, 5},
            {9, 2, 6},
            {4, 8, 7}
        };

        int N = matrix.length;
        int[] arr = new int[N * N];
        int index = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[index++] = matrix[i][j];
            }
        }


        Arrays.sort(arr);

        index = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = arr[index++];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
