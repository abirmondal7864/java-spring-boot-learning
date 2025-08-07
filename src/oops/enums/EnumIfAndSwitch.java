package oops.enums;

/**
 * The {@code Sts} enum defines a fixed set of constants
 * representing the status of a task or process.
 */
enum Sts {
    RUNNING,
    FAILED,
    PENDING,
    SUCCESS;
}

/**
 * The {@code EnumIfAndSwitch} class demonstrates the use of
 * if-else and switch-case constructs with enums in Java.
 */
public class EnumIfAndSwitch {
    /**
     * The main method demonstrating enum handling
     * with if-else and switch-case constructs in Java.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        Sts status= Sts.RUNNING;

        // Handling enum with if-else statements
        if (status == Sts.RUNNING) {
            System.out.println("All good");
        } else if (status == Sts.FAILED) {
            System.out.println("Try again");
        } else if (status == Sts.PENDING) {
            System.out.println("Please wait");
        } else {
            System.out.println("Done");
        }


        // Handling enum with switch-case statements
        switch (status) {
            case RUNNING:
                System.out.println("All good");
                break;

            case FAILED:
                System.out.println("Try again");
                break;

            case PENDING:
                System.out.println("Please wait");
                break;

            default:
                System.out.println("Done");
        }
    }
}
