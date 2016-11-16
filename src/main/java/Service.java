import java.util.HashMap;
import java.util.Map;

/**
 * author Igor
 */
public class Service {

    String name;


    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>(1, 12);

        map.put(1, "Alex");
        map.put(2, "Alex");
        map.put(3, "Alex");
        map.put(5, "Alex");
        map.put(6, "Alex");
        map.put(6, "Alex");

        map.keySet().forEach(System.out::println);
        map.values().forEach(System.out::println);

        map.entrySet().forEach(System.out::println);
    }
}
