package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String chars, String word) {
        chars = chars.toLowerCase();
        word = word.toLowerCase();
        List listChars = new ArrayList();
        for (int i = 0; i < chars.length(); i++) {
            listChars.add(chars.charAt(i));
        }
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (!listChars.contains(letter)) {
                return false;
            } else {
                listChars.remove(Character.valueOf(letter));
            }
        }
        return true;
    }
}
//END
