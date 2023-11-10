public class StringUtils {
    public static String RemoveDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        char prev = '\0';
        for (char c : s.toCharArray()) {
            if (c != prev) {
                sb.append(c);
                prev = c;
            }
        }
        return sb.toString();
    }
}
