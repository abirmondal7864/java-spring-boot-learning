package collectionapi;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates the usage of ArrayList with and without Generics.
 * <p>
 * - Without Generics: Elements are stored as Object type, requiring explicit casting.
 * - With Generics: Type safety is enforced at compile-time, avoiding casting and runtime errors.
 */
public class ArrayListDemo {

    /**
     * Main method to run the ArrayList demonstration.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        /**
         * -------------------------
         * 1. Without Generics (old way)
         * -------------------------
         * - Uses raw ArrayList type.
         * - Allows storing any Object (e.g., Integer, String).
         * - Requires explicit casting when retrieving.
         * - Risk: Adding the wrong type causes runtime errors.
         */
        ArrayList nums1 = new ArrayList(); // raw type
        nums1.add(6);
        nums1.add(5);
        nums1.add(8);
        nums1.add(2);
        // nums1.add("5"); // Compiles, but will throw ClassCastException later

        System.out.println("Without Generics (manual casting):");
        for (Object n : nums1) {
            int num = (Integer) n; // explicit cast required
            System.out.println(num * 2);
        }

        /**
         * -------------------------
         * 2. With Generics (modern way)
         * -------------------------
         * - Uses List<Integer>.
         * - Type-safe: only Integer objects are allowed.
         * - No casting required when retrieving.
         * - Prevents runtime ClassCastException at compile-time.
         */
        List<Integer> nums2 = new ArrayList<>();
        nums2.add(6);
        nums2.add(5);
        nums2.add(8);
        nums2.add(2);
        // nums2.add("5"); // Compile-time error: incompatible types

        System.out.println("\nWith Generics (type-safe):");
        System.out.println("Index of 5: " + nums2.indexOf(5)); // prints 1
        System.out.println("Element at index 2: " + nums2.get(2)); // prints 8
    }
}
