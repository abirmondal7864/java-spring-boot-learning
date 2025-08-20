package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Demonstrates why and how to use the Java Stream API.
 * <p>
 * This example performs the following operations on a list of integers:
 * <ul>
 *   <li>Filters even numbers.</li>
 *   <li>Doubles each even number.</li>
 *   <li>Reduces (sums) them into a single result.</li>
 * </ul>
 *
 * <p>For the list {@code [4, 5, 7, 3, 2, 6]}:</p>
 * <pre>
 * Even numbers = [4, 2, 6]
 * Doubled = [8, 4, 12]
 * Sum = 24
 * </pre>
 */
public class WhyStreamAPI {

    /**
     * The entry point of the program.
     * <p>
     * Creates a list of integers, processes it using the Stream API,
     * and prints the result.
     * </p>
     *
     * @param args command-line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        /*
         * Example using Stream API step by step:
         * Stream<Integer> s1 = nums.stream();
         * Stream<Integer> s2 = s1.filter(n -> n % 2 == 0); // evens
         * Stream<Integer> s3 = s2.map(n -> n * 2);         // doubled
         * int result = s3.reduce(0, (c, e) -> c + e);      // sum
         */

        // Stream pipeline in a single chain
        int result = nums.stream()
                .filter(n -> n % 2 == 0)      // keep only even numbers
                .map(n -> n * 2)              // double each even number
                .reduce(0, (c, e) -> c + e);  // sum them up

        // Print the result
        System.out.println(result);
    }
}
