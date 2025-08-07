package oops.enums;

/**
 * The {@code Status} enum defines a fixed set of constants
 * representing the status of a task or process.
 */
enum Status {
    RUNNING,
    FAILED,
    PENDING,
    SUCCESS;
}

/**
 * The {@code EnumIntro} class demonstrates how to use enums in Java.
 * It prints all the possible values defined in the {@code Status} enum.
 */
public class EnumIntro {

    /**
     * The main method retrieves all enum values using {@code Status.values()}
     * and prints each one to the console.
     *
     * @param args command-line arguments (not used here)
     */
    public static void main(String[] args) {
        // Get all the constants of the Status enum
        Status[] statusArray = Status.values();

        // Print each status value
        for (Status status : statusArray) {
            System.out.println(status);
        }
    }
}
