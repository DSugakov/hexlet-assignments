package exercise;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        List<String> result = users.stream()
                .filter(user -> "male".equals(user.get("gender")))
                .sorted(Comparator.comparing(user -> LocalDate.parse(user.get("birthday"), format)))
                .map(user -> user.get("name"))
                .collect(Collectors.toList());
        return result;
    }
}
// END
