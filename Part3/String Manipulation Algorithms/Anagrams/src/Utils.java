import java.util.Arrays;

public class Utils {
    public static boolean areAnagrams(String first, String second) {

        if (first == null || second == null)
            return false;

        var array1 = first.toLowerCase().toCharArray();
        Arrays.sort(array1);

        var array2 = second.toLowerCase().toCharArray();
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
}
