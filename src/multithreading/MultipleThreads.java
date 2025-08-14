package multithreading;

/**
 * The {@code A} class extends {@link Thread} and
 * represents a thread that repeatedly prints "hi" to the console.
 */
class A extends Thread {

    /**
     * The entry point for thread execution.
     * Prints "hi" 100 times to the console.
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hi");
        }
    }
}

/**
 * The {@code B} class extends {@link Thread} and
 * represents a thread that repeatedly prints "hello" to the console.
 */
class B extends Thread {

    /**
     * The entry point for thread execution.
     * Prints "hello" 100 times to the console.
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
        }
    }
}

/**
 * Demonstrates creating and running multiple threads in Java.
 * <p>
 * This example starts two separate threads:
 * <ul>
 *     <li>Thread A: Prints "hi" 100 times.</li>
 *     <li>Thread B: Prints "hello" 100 times.</li>
 * </ul>
 * The threads run concurrently, so their output may be interleaved.
 */
public class MultipleThreads {

    /**
     * The main method creates and starts two threads:
     * one for printing "hi" and another for printing "hello".
     *
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}
