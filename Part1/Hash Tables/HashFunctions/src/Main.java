import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "orange";

        System.out.println(str.hashCode());

        Map<String, String> map = new HashMap<>();
        map.put("123456-A", "a");
        System.out.println(hash("123456 - A"));
    }

    public static int hash(String Key) {
        int hash = 0;

        for (var ch : Key.toCharArray()) {
            hash += ch;
        }
        return hash % 100;
    }
}