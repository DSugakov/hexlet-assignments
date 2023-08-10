package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        return emails.stream()
                .filter(App::isFreeDomain)
                .count();
    }

    private static boolean isFreeDomain(String email) {
        String[] freeDomains = {"gmail.com", "yandex.ru", "hotmail.com"};
        String domain = email.substring(email.lastIndexOf("@") + 1);
        return Arrays.asList(freeDomains).contains(domain);
    }
}
// END
