package streamapi;

import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates the difference between Stream API (sequential)
 * and Parallel Stream API (parallel execution).
 *
 * Note:
 * - Stream API processes elements one by one in order.
 * - Parallel Stream API splits the work into multiple threads,
 *   which may improve performance on large datasets but does not
 *   guarantee order of execution in forEach().
 */
public class ParallelStream {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        /**
         * Example 1: Using Stream API (sequential)
         */
        System.out.println("=== Stream API (sequential) ===");
        nums.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        /**
         * Example 2: Using Parallel Stream API
         */
        System.out.println("\n=== Parallel Stream API ===");
        nums.parallelStream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
