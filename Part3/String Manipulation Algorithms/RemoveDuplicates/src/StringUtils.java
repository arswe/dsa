import java.util.HashSet;
import java.util.Set;

public class StringUtils {
    public static String RemoveDuplicates(String s) {

        if (s == null)
            return "";

        StringBuilder output = new StringBuilder();
        Set<Character> seen = new HashSet<>();


        for (var ch : s.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                output.append(ch);
            }
        }
        return output.toString();
    }
}
