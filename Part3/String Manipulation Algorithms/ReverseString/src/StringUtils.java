public class StringUtils {
    public static String reverse(String text) {
        if (text == null) {
            return "";
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
    }
}
