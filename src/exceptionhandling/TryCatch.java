package exceptionhandling;

/**
 * The {@code TryCatch} class demonstrates the use of a try-catch block in Java
 * to handle exceptions during runtime.
 * <p>
 * In this example, a division by zero operation is attempted, which causes
 * an {@link ArithmeticException}. This is caught by a general
 * {@link Exception} handler to prevent the program from crashing.
 */
public class TryCatch {

    /**
     * The main method where the program execution begins.
     * <p>
     * This method attempts to divide {@code 18} by {@code i} (which is zero),
     * resulting in an {@link ArithmeticException}. The exception is caught,
     * a message is printed, and the program continues to execute.
     * </p>
     *
     * @param args command-line arguments passed to the program (not used here)
     */
    public static void main(String[] args) {
        int i = 0; // Divisor
        int j = 0; // Result of division

        try {
            // Attempting division by zero
            j = 18 / i;
        } catch (Exception e) {
            // Handles any exception thrown in the try block
            System.out.println("Something went wrong");
        }

        // Output the result (will remain 0 if exception occurs)
        System.out.println(j);

        // Final message indicating program continuation
        System.out.println("Bye");
    }
}
