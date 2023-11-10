public class Utils {
    public static boolean isPalindrome(String word) {
        var input = new StringBuilder(word);
        var reversed = input.reverse().toString();
        return word.equals(reversed);
    }
}
