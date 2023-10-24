import java.util.ArrayList;

public class DynamicArrays {

    public static void show() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);
        list.contains(1); // returns true
        list.toArray();

        System.out.println(list);
        System.out.println("Index of 2: " + list.indexOf(2));
    }
}
