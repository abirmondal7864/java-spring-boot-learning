package exceptionhandling;

/**
 * Demonstrates the use of multiple catch blocks in Java exception handling.
 * <p>
 * This example triggers different exceptions such as:
 * <ul>
 *     <li>{@link ArithmeticException} - division by zero (commented logic in this case)</li>
 *     <li>{@link NullPointerException} - calling methods on a null reference</li>
 *     <li>{@link ArrayIndexOutOfBoundsException} - accessing an array with an invalid index</li>
 *     <li>{@link Exception} - generic catch for all other exceptions</li>
 * </ul>
 * It also shows the execution flow after exception handling.
 * </p>
 */
public class TryWithMultipleCatch {

    /**
     * Entry point of the program.
     *
     * @param args Command-line arguments (not used here)
     */
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        int[] nums = new int[5];
        String str = null;

        try {
            // Division operation (will not cause ArithmeticException since i != 0)
            j = 18 / i;

            // Will throw NullPointerException since str is null
            System.out.println(str.length());

            // Valid array access
            System.out.println(nums[1]);

            // Will throw ArrayIndexOutOfBoundsException
            System.out.println(nums[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
        catch (Exception e) {
            // This will catch NullPointerException and other exceptions not caught earlier
            System.out.println("Something went wrong... " + e);
        }

        // This will still run after exception handling
        System.out.println(j);
        System.out.println("Bye");
    }
}
