package collectionapi;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Collection;
import java.util.Iterator;


/**
 * The {@code SetDemo} class demonstrates the usage of different implementations
 * of the {@link java.util.Set} interface in Java, including:
 * <ul>
 *     <li>{@link java.util.HashSet} - Stores elements in an unordered manner.</li>
 *     <li>{@link java.util.TreeSet} - Stores elements in sorted (natural ordering) manner.</li>
 *     <li>Iteration over a {@link java.util.Collection} using {@link java.util.Iterator}.</li>
 * </ul>
 * <p>
 * This program highlights the differences between unsorted and sorted sets
 * and shows how to iterate through a collection.
 * </p>
 *
 */
public class SetDemo {

    /**
     * The main method is the entry point of the program.
     * It demonstrates:
     * <ol>
     *     <li>Creating and printing an unsorted {@link HashSet}.</li>
     *     <li>Creating and printing a sorted {@link TreeSet}.</li>
     *     <li>Using an {@link Iterator} to traverse elements in a {@link TreeSet}.</li>
     * </ol>
     *
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {

        // Example 1: Using HashSet (unordered)
        Set<Integer> set1 = new HashSet<>();
        set1.add(54);
        set1.add(62);
        set1.add(82);
        set1.add(21);

        for (int n : set1) {
            System.out.println("Unsorted set: " + n);
        }

        // Example 2: Using TreeSet (sorted in natural order)
        Set<Integer> set2 = new TreeSet<>();
        set2.add(62);
        set2.add(54);
        set2.add(82);
        set2.add(21);

        for (int n : set2) {
            System.out.println("Sorted set: " + n);
        }

        // Example 3: Iterating over a TreeSet using Iterator
        Collection<Integer> set3 = new TreeSet<>();
        set3.add(62);
        set3.add(54);
        set3.add(82);
        set3.add(21);

        Iterator<Integer> itr = set3.iterator();

        //checks if another element exists.
        while (itr.hasNext()) {

            //returns the next element in the iteration.
            System.out.println("Iterator output: " + itr.next());
        }
    }
}
