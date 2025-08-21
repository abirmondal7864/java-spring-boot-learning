package streamapi;

import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates usage of Java Stream API with Optional.
 * <p>
 * This example filters a list of names to find the first name containing
 * the character 'h'. If no such name is found, a default value is returned.
 * </p>
 */
public class OptionalEx {

    /**
     * Main method - program entry point.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Initialize a list of names
        List<String> names = Arrays.asList("Abir", "Sounak", "Akash", "Rounik");

        /**
         * Stream processing:
         * 1. Convert the list into a stream.
         * 2. Filter names containing the character 'h'.
         * 3. Find the first matching element (if any).
         * 4. Provide a default string if no match is found.
         */
        String name = names.stream()
                .filter(str -> str.contains("h"))  // filter condition
                .findFirst()                       // get first match (Optional)
                .orElse("Not found");              // default if not present

        // Print the result
        System.out.println(name);
    }
}
