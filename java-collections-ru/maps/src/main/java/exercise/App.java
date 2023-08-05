package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static HashMap<String, Integer> getWordCount(String sentence) {
        if (sentence.isEmpty()) {
            return new HashMap<>();
        }
        String[] splitWords = sentence.split(" ");
        HashMap<String, Integer> words = new HashMap<>();
        for (String splitWord : splitWords) {
            if (!words.containsKey(splitWord)) {
                words.put(splitWord, 1);
            } else {
                int count = words.get(splitWord);
                words.put(splitWord, count + 1);
            }
        }
        return words;
    }

    public static String toString(Map<String, Integer> wordCountMap) {
        if (wordCountMap.isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            sb.append("  ").append(word).append(": ").append(count).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
//END
