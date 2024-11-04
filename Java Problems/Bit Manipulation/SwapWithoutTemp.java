public class SwapWithoutTemp {
    public static void swap(int x, int y) {
        System.out.println("Before swap: x = " + x + ", y = " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swap: x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        int x = 3, y = 5;
        swap(x, y);
    }
}
