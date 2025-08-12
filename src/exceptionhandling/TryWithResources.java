package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Demonstrates two ways to handle resource cleanup when reading input from the console:
 * <ul>
 *     <li>Using a traditional {@code try-finally} block to close resources</li>
 *     <li>Using the modern try-with-resources statement (Java 7+)</li>
 * </ul>
 *
 * <p>Both methods ensure that the {@link BufferedReader} is properly closed,
 * but try-with-resources is cleaner and less error-prone.</p>
 *
 * <p>Usage: Run the program and enter an integer value when prompted.</p>
 *
 */
public class TryWithResources {

    /**
     * Main method to demonstrate resource management in Java.
     *
     * @param args Command-line arguments (not used in this program)
     * @throws NumberFormatException If the user enters a non-numeric value
     * @throws IOException           If an I/O error occurs while reading input
     */
    public static void main(String[] args) throws NumberFormatException, IOException {


        // -------------------------------
        // Using finally block to close the resources
        // -------------------------------

        /**
         * Traditional way: declare BufferedReader outside try block,
         * initialize inside, then close in finally block.
         * This approach requires null-check to avoid NullPointerException.
         */
//        BufferedReader br = null;
//        try {
//            InputStreamReader in = new InputStreamReader(System.in);
//            br = new BufferedReader(in);
//
//            int num1 = Integer.parseInt(br.readLine());
//            System.out.println("You entered: " + num1);
//        } finally {
//            if (br != null) { // prevent NullPointerException
//                br.close();
//            }
//        }


        // -------------------------------
        // Using try-with-resources statement
        // -------------------------------

        /**
         * Modern way: try-with-resources automatically closes the resource
         * at the end of the try block, even if an exception occurs.
         */
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            num = Integer.parseInt(br.readLine());
            System.out.println("The number is: " + num);
        }
    }
}
