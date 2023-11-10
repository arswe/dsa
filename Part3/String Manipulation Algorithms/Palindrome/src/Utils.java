public class Utils {
    public static boolean isPalindrome(String word) {
//        var input = new StringBuilder(word);
//        var reversed = input.reverse().toString();
//        return word.equals(reversed);

        if (word == null)
            return false;

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right))
                return false;
        }
        return true;
    }
}
