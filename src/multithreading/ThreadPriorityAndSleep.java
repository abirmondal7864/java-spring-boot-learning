package multithreading;

/**
 * Class C represents a thread that prints "hi" multiple times
 * with a short delay between each print.
 */
class C extends Thread {

    /**
     * The run method contains the logic executed by the thread.
     * It prints "hi" 100 times with a 10 ms pause after each print.
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10); // Pause to allow other threads to run
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * Class D represents a thread that prints "hello" multiple times
 * with a short delay between each print.
 */
class D extends Thread {

    /**
     * The run method contains the logic executed by the thread.
     * It prints "hello" 100 times with a 10 ms pause after each print.
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10); // Pause to allow other threads to run
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * The ThreadPriorityAndSleep class demonstrates basic multithreading in Java.
 * <p>
 * It creates two threads (A and B) that print messages concurrently.
 * The main thread sleeps briefly after starting the first thread
 * to create a small delay before starting the second thread.
 * </p>
 */
public class ThreadPriorityAndSleep {

    /**
     * Main method to run the multithreading example.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        C obj1 = new C();
        D obj2 = new D();

        obj1.start(); // Start the first thread

        try {
            Thread.sleep(5); // Small delay before starting second thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        obj2.start(); // Start the second thread
    }
}
