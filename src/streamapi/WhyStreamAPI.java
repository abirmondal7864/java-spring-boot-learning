package streamapi;

import java.util.Arrays;
import java.util.List;

/**
 * The {@code WhyStreamAPI} class demonstrates the use of Java Stream API
 * and functional-style operations on collections.
 * <p>
 * In this example, a list of integers is created and printed using the
 * {@code forEach} method with a lambda expression.
 * </p>
 *
 * <p><b>Key concepts demonstrated:</b></p>
 * <ul>
 *   <li>Creating a list using {@link java.util.Arrays#asList(Object...)}</li>
 *   <li>Iterating elements using {@link java.util.List#forEach(java.util.function.Consumer)}</li>
 *   <li>Using lambda expressions in Java</li>
 * </ul>
 *
 */
public class WhyStreamAPI {

    /**
     * The entry point of the program.
     * <p>
     * It creates a list of integers and prints each element to the console
     * using the {@code forEach} method.
     * </p>
     *
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        // Print each number in the list using forEach and lambda expression
        nums.forEach(n -> System.out.println(n));
    }
}
