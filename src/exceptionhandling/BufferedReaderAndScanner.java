package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Demonstrates the difference between using {@link BufferedReader} and {@link Scanner}
 * for reading input from the console in Java.
 * <p>
 * <b>BufferedReader:</b> Reads text from an input stream efficiently, but only as {@code String}.
 * Requires manual parsing for numeric types.
 * <br>
 * <b>Scanner:</b> Parses primitive types and strings using regular expressions,
 * making it more convenient but slightly slower.
 * </p>
 */
public class BufferedReaderAndScanner {

    /**
     * The entry point of the program. It demonstrates reading an integer
     * from the console using both {@link BufferedReader} and {@link Scanner}.
     *
     * @param args Command-line arguments (not used).
     * @throws IOException If an I/O error occurs while reading from the console.
     */
    public static void main(String[] args) throws IOException {

        // ----- BufferedReader Example -----
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        System.out.print("Enter an integer using BufferedReader: ");
        int num1 = Integer.parseInt(bf.readLine()); // read as String, then parse
        System.out.println("You entered (BufferedReader): " + num1);

        // ----- Scanner Example -----
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer using Scanner: ");
        int num2 = sc.nextInt(); // directly reads as int
        System.out.println("You entered (Scanner): " + num2);

        sc.close();
    }
}
