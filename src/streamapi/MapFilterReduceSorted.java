package streamapi;

import java.util.Arrays;
import java.util.List;


/**
 * Demonstrates the usage of Stream API methods such as map, filter, reduce, and sorted.
 * This class processes a list of integers and applies various Stream operations,
 * showcasing common functional programming tasks using Java streams.
 */
public class MapFilterReduceSorted {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        /**
         * Stream.map(Function)
         * <p>Returns a stream consisting of the results of applying
         * the given function to each element.</p>
         */
        System.out.println(nums.stream().map(n-> n * n ).toList());

        /**
         * Stream.map(Function)
         * <p>Returns a stream consisting of the results of applying
         * the given function to each element.</p>
         */
        System.out.println(nums.stream().filter(n-> n % 2 == 0).toList());


        /**
         * Stream.reduce(T identity, BinaryOperator<T> accumulator)
         * <p>Performs a reduction on the elements of this stream,
         * using the provided identity value and an associative
         * accumulation function, and returns the reduced value.</p>
         */
        System.out.println(nums.stream().reduce(0, Integer::sum));

        /**
         * Stream.sorted()
         * <p>Returns a stream consisting of the elements of this
         * stream, sorted in natural order.</p>
         */
        System.out.println(nums.stream().sorted().toList());

        /**
         * Stream.toList()
         * <p>Collects the elements of this stream into an unmodifiable List.</p>
         */
    }
}
