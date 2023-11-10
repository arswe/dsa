public class Utils {
    public static boolean areAnagrams(String first, String second) {

        final int ENG_ALPHABET_LENGTH = 26;
        int[] frequencies = new int[ENG_ALPHABET_LENGTH];


        for (var i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);
            if (!Character.isLetter(ch))
                continue;
            frequencies[ch - 'a']++;
        }

        for (var i = 0; i < second.length(); i++) {
            char ch = second.charAt(i);
            if (!Character.isLetter(ch))
                continue;
            frequencies[ch - 'a']--;
        }

        for (var frequency : frequencies)
            if (frequency != 0)
                return false;

        return true;

    }
}
