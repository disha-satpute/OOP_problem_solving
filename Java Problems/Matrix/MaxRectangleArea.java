import java.util.Stack;

public class MaxRectangleArea {

    public static int maxRectangleArea(int[][] matrix) {
        int n = matrix.length;
        if (n == 0) return 0;
        int m = matrix[0].length;

        int[] heights = new int[m];
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                heights[j] = matrix[i][j] == 0 ? 0 : heights[j] + 1;
            }

            maxArea = Math.max(maxArea, maxHistogramArea(heights));
        }

        return maxArea;
    }


    private static int maxHistogramArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int m = heights.length;

        for (int i = 0; i <= m; i++) {
            int height = (i == m) ? 0 : heights[i];
            while (!stack.isEmpty() && height < heights[stack.peek()]) {
                int h = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, h * width);
            }
            stack.push(i);
        }
        
        return maxArea;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {0, 1, 1, 1, 0}
        };

        System.out.println("Maximum area of rectangle of 1's is: " + maxRectangleArea(matrix));
    }
}
