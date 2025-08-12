package exceptionhandling;

/**
 * Class A demonstrates a method that "ducks" (propagates) a checked exception
 * using the 'throws' keyword instead of handling it internally.
 */
class A {

    /**
     * Attempts to load a class named "Calc" at runtime using reflection.
     * This method does not handle the ClassNotFoundException itself but declares
     * it with the 'throws' keyword so the caller must handle it.
     *
     * @throws ClassNotFoundException if the class "Calc" is not found in the classpath.
     */
    public void show() throws ClassNotFoundException {
        Class.forName("Calc"); // Attempts to dynamically load Calc class
    }
}

/**
 * Main driver class demonstrating:
 * <ul>
 *   <li>How a checked exception can be propagated ("ducked") to the caller</li>
 *   <li>Static initialization blocks execution before main()</li>
 * </ul>
 */
public class DuckingException {

    /**
     * Static initialization block that executes once when the class is loaded.
     * Used here to demonstrate when static blocks run relative to main().
     */
    static {
        System.out.println("Class loaded");
    }

    /**
     * Main entry point of the program.
     * Creates an object of class A and calls its show() method.
     * Handles the potential ClassNotFoundException thrown by show().
     *
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
