package exceptionhandling;

/**
 * Demonstrates the use of the {@code throw} keyword to manually
 * throw exceptions in Java, along with handling them using
 * multiple {@code catch} blocks.
 *
 * <p>This example performs a division operation and throws
 * a custom {@link ArithmeticException} if the result is zero.
 * It also shows how to provide a default value when an exception occurs.</p>
 */
public class ExceptionThrowKeyword {

    /**
     * Main method that executes the division operation and
     * demonstrates exception handling with the {@code throw} keyword.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        int i = 2; // Divisor
        int j = 0; // Result holder

        try {
            j = 18 / i; // Perform division

            // If result is zero, throw a custom ArithmeticException
            if (j == 0) {
                throw new ArithmeticException("I don't want to print zero");
            }

        } catch (ArithmeticException e) {
            // Handle specific ArithmeticException
            j = 18 / 1; // Provide default result
            System.out.println("That's the default output: " + e);

        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("Something went wrong: " + e);
        }

        // Print the result and exit message
        System.out.println(j);
        System.out.println("Bye");
    }
}
