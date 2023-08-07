package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Objects;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> dictionary) {
        List<Map<String, String>> result =  new ArrayList<>();
        for (Map<String, String> book : books) {
            boolean match = true;
            for (Map.Entry<String, String> dict : dictionary.entrySet()) {
                String key = dict.getKey();
                String value = dict.getValue();

                if (book.containsKey(key) && !book.get(key).equals(value)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
