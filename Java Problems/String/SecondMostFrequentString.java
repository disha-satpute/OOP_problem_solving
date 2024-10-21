import java.util.HashMap;
import java.util.Map;

public class SecondMostFrequentString {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "orange", "apple", "banana", "banana", "kiwi", "orange", "kiwi"};
        String result = findSecondMostFrequent(strings);
        System.out.println("The second most repeated string is: " + result);
    }

    public static String findSecondMostFrequent(String[] strings) {
        // Map to store the frequency of each string
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String str : strings) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }

        String first = null;
        String second = null;
        int firstCount = 0;
        int secondCount = 0;

        
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            int count = entry.getValue();
            String str = entry.getKey();

            if (count > firstCount) {
                // Update first and second
                secondCount = firstCount;
                second = first;
                firstCount = count;
                first = str;
            } else if (count > secondCount && count < firstCount) {
                // Update second only
                secondCount = count;
                second = str;
            }
        }

        return second != null ? second : "No second most frequent string found";
    }
}
