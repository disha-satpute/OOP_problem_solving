import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV"; // Example input
        int result = romanToInt(s);
        System.out.println("The integer value is: " + result);
    }

    public static int romanToInt(String s) {
        // Map to store Roman numeral values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        int total = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            // Get the value of the current Roman numeral
            int currentValue = romanMap.get(s.charAt(i));
            
            // Check if the next numeral exists and if the current value is less than the next
            if (i + 1 < length && currentValue < romanMap.get(s.charAt(i + 1))) {
                // Subtract current value (special case)
                total -= currentValue;
            } else {
                // Add current value
                total += currentValue;
            }
        }

        return total;
    }
}
