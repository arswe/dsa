import java.util.Arrays;
import java.util.Collections;

public class ReverseWords {
    public static String reverseWords(String sentence) {
        if (sentence == null)
            return "";

        String[] words = sentence.trim().split(" ");
//        StringBuilder reversed = new StringBuilder();
//
//        for (var i = words.length - 1; i >= 0; i--)
//            reversed.append(words[i]).append(" ");
//        return reversed.toString().trim();

        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
}
