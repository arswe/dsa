import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Mosh");
        map.put(2, "John");
        map.put(3, "Mary");
//        map.put(null, null); // null key and null value
//        map.remove(null); // remove null key

//        map.containsKey(3);
//        var result = map.containsKey(3);
//        var result = map.get(3);
//        System.out.println(result);

        for (var item : map.entrySet())
            System.out.println(item);

    }
}