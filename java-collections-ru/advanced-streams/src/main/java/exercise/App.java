package exercise;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static String getForwardedVariables(String configFileContent) {

        Pattern pattern = Pattern.compile("environment=\"(.*?)\"");
        Matcher matcher = pattern.matcher(configFileContent);

        List<String> variables = new ArrayList<>();

        while (matcher.find()) {
            String group = matcher.group(1);
            String[] split = group.split(",");

            for (String s : split) {
                if (s.startsWith("X_FORWARDED_")) {
                    String[] parts = s.split("=");
                    if (parts.length == 2) {
                        String substring = parts[0].substring("X_FORWARDED_".length());
                        String part = parts[1];
                        variables.add(substring + "=" + part);
                    }
                }
            }
        }

        return String.join(",", variables);
    }
}