package exceptionhandling;

/**
 * Custom checked exception to demonstrate user-defined exceptions in Java.
 */
class AbirException extends Exception {
    /**
     * Constructs a new AbirException with the specified detail message.
     *
     * @param message The detail message for the exception.
     */
    public AbirException(String message) {
        super(message);
    }
}

/**
 * Demonstrates handling of a custom checked exception (AbirException)
 * along with general exception handling in Java.
 */
public class CustomException {

    /**
     * Main method to demonstrate throwing and catching custom exceptions.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try {
            // Attempt division by zero — will throw ArithmeticException
            j = 18 / i;

            // Throw custom exception if result is zero
            if (j == 0) {
                throw new AbirException("I don't want to print zero");
            }
        } catch (AbirException e) {
            // Handle the custom exception and provide a default value
            j = 18 / 1; // default output
            System.out.println("That's the default output: " + e);
        } catch (Exception e) {
            // Handle any other exceptions (e.g., ArithmeticException)
            System.out.println("Something went wrong: " + e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
