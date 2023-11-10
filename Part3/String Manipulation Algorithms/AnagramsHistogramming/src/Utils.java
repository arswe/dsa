public class Utils {
    public static boolean areAnagrams(String first, String second) {

        final int ENG_ALPHABET_LENGTH = 26;
        int[] frequencies = new int[ENG_ALPHABET_LENGTH];

        first = first.toLowerCase();
        second = second.toLowerCase();

        for (var i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);
            if (Character.isLetter(ch)) {
                frequencies[ch - 'a']++;
            }
        }

        for (var i = 0; i < second.length(); i++) {
            char ch = second.charAt(i);
            if (Character.isLetter(ch)) {
                frequencies[ch - 'a']--;
            }
        }


        for (var i = 0; i < ENG_ALPHABET_LENGTH; i++) {
            if (frequencies[i] != 0) {
                return false;
            }
        }

        return true;

    }
}
