public class Marathon {
    public static void main(String[] args) {

        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", 
                           "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };

        int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };

        int fastest = 0;
        for (int i = 1; i < times.length; i++) {
            if (times[i] < times[fastest]) {
                fastest = i;
            }
        }

        int second = -1;
        for (int i = 0; i < times.length; i++) {
            if (i != fastest) {
                if (second == -1 || times[i] < times[second]) {
                    second = i;
                }
            }
        }

        System.out.println("Fastest runner: " + names[fastest] + " with a time of " + times[fastest] + " minutes.");
        System.out.println("Second fastest runner: " + names[second] + " with a time of " + times[second] + " minutes.");
    }
}
