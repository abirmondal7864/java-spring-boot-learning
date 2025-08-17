package collectionapi;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;


/**
 * Demonstrates differences between {@link HashMap} and {@link Hashtable} in Java.
 * <p>
 * Key points:
 * <ul>
 *   <li>{@link HashMap} - Not synchronized, allows one null key and multiple null values.</li>
 *   <li>{@link Hashtable} - Synchronized (thread-safe), does not allow null keys or values.</li>
 * </ul>
 *
 * <p>This example shows how the three implementations behave when storing student marks.
 */
public class MapDemo {

    /**
     * Entry point of the program.
     * <p>
     * It demonstrates the usage of:
     * <ul>
     *   <li>{@link HashMap} with null keys/values.</li>
     *   <li>{@link Hashtable} without nulls.</li>
     *   <li>{@link ConcurrentHashMap} as a modern thread-safe alternative.</li>
     * </ul>
     *
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {


        // -------------------- HashMap --------------------
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Abir", 95);
        hashMap.put("Abhradeep", 88);
        hashMap.put("Akash", 33);
        hashMap.put("Sounak", 74);
        hashMap.put("Debayan", 51);
        hashMap.put("Akash", 67); // Overwrites previous value for "Akash"
        hashMap.put(null, 100);   // HashMap allows one null key
        hashMap.put("NullValue1", null); // HashMap allows null values
        hashMap.put("NullValue2", null);

        System.out.println("\n=== HashMap (Not synchronized, allows nulls) ===");
        System.out.println("Keys   : " + hashMap.keySet());
        System.out.println("Values : " + hashMap.values());
        System.out.println("Map    : " + hashMap);



        // -------------------- Hashtable --------------------
        Map<String, Integer> hashtable = new Hashtable<>();

        hashtable.put("Abir", 95);
        hashtable.put("Abhradeep", 88);
        hashtable.put("Akash", 33);
        hashtable.put("Sounak", 74);
        hashtable.put("Debayan", 51);
        hashtable.put("Akash", 67); // Overwrites previous value for "Akash"
        // hashtable.put(null, 100);   // Null key not allowed
        // hashtable.put("NullValue", null); // Null value not allowed

        System.out.println("\n=== Hashtable (Synchronized, no nulls) ===");
        System.out.println("Keys   : " + hashtable.keySet());
        System.out.println("Values : " + hashtable.values());
        System.out.println("Map    : " + hashtable);

    }
}
