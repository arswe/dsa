public class Utils {
    public static boolean areAnagrams(String first, String second) {

        if (first == null || second == null || first.length() != second.length())
            return false;

        final int ENG_ALPHABET_LENGTH = 26;
        int[] frequencies = new int[ENG_ALPHABET_LENGTH];

        first = first.toLowerCase();
        second = second.toLowerCase();

        for (var i = 0; i < first.length(); i++)
            frequencies[first.charAt(i) - 'a']++;

        for (var i = 0; i < second.length(); i++) {
            var index = second.charAt(i) - 'a';
            if (frequencies[index] == 0)
                return false;
            frequencies[index]--;
        }

        return true;
    }
}
