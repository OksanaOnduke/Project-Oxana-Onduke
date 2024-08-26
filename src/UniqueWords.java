import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UniqueWords {

    public static void main(String[] args) {
        String[] words = {"dog", "cat", "monkey", "dog", "mouse", "dog", "bear", "wolf", "cat", "duck"};

        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        Set<String> uniqueWords = wordCounts.keySet();
        for (String word : uniqueWords) {
            System.out.println(word + ": " + wordCounts.get(word));
        }
    }
}
