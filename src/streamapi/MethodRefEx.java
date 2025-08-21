package streamapi;

import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates the use of Java Stream API and method references.
 * <p>
 * This example converts a list of names to uppercase using
 * {@link java.util.stream.Stream#map(java.util.function.Function)}
 * and {@link String#toUpperCase()}.
 * The result is then collected into a new list and printed
 * using a method reference to {@link System#out}.
 * </p>
 */
public class MethodRefEx {

    /**
     * The entry point of the program.
     * <p>
     * It creates a list of names, transforms them into uppercase using
     * the Stream API, and prints each name.
     * </p>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Abir", "Sounak", "Ravi", "Kiran");

        List<String> uNames = names.stream()
                .map(String::toUpperCase)   // Method reference for conversion
                .toList();                  // Collect results into a list

        uNames.forEach(System.out::println); // Print each name
    }
}
