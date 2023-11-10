import java.util.HashMap;
import java.util.Map;

public class StringUtils {
    public static char getMaxOccuringChar(String str) {
        int ASCII_SIZE = 256;
        int[] frequencies = new int[ASCII_SIZE];

        for (var ch : str.toCharArray())
            frequencies[ch]++;

        int max = 0;
        char result = ' ';

        for (var i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > max) {
                max = frequencies[i];
                result = (char) i;
            }
        }
        return result;
    }
}
