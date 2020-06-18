package theory.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Interface which stores the elements in pairs (key->value) - known as Entry
 * Keys are always unique, if you provide the same key, it will return the last value
 * Values can be duplicated
 * THE HASHMAP DOES NOT MAINTAIN ORDER
 */
public class MapsDemo {
    public static void main(String[] args) {
        Map<String, String> demoMap = new HashMap<>();
        demoMap.put("key", "value");
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "BMW");
        map.put(2, "BMW");
        map.put(2, "Audi");
        map.put(3, "Honda");
        System.out.println(map);
        System.out.println("Now we're printing stuff using the get() method:\n"+map.get(0)+"\n" +map.get(2));
    }
}
