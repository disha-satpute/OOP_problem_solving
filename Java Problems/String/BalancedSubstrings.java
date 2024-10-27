public class BalancedSubstrings {
    public static void main(String[] args) {
        String str = "00110011";
        int result = maxBalancedSubstrings(str);
        System.out.println(result);
    }

    public static int maxBalancedSubstrings(String str) {
        int count0 = 0;
        int count1 = 0;
        int balancedCount = 0;

        for (char c : str.toCharArray()) {
            if (c == '0') {
                count0++;
            } else if (c == '1') {
                count1++;
            } else {
                return -1;
            }

            if (count0 == count1) {
                balancedCount++;

                count0 = 0;
                count1 = 0;
            }
        }

        return balancedCount > 0 ? balancedCount : -1;
    }
}
