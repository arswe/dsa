public class StringUtils {
    public static boolean areRotations(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        return (str1 + str1).contains(str2);
    }
}
