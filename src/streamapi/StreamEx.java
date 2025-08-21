package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * The {@code StreamEx} class demonstrates the performance difference
 * between using Java Streams in sequential and parallel mode.
 * <p>
 * It generates a list of random integers, then applies a computationally
 * expensive mapping operation (simulated with {@code Thread.sleep(1)})
 * using both sequential and parallel streams. The execution times are
 * measured and compared.
 * </p>
 */
public class StreamEx {

    /**
     * Entry point of the program.
     * <p>
     * Steps:
     * <ol>
     *   <li>Generate a list of random integers.</li>
     *   <li>Process the list with a sequential stream and measure the time.</li>
     *   <li>Process the list with a parallel stream and measure the time.</li>
     *   <li>Print the sums and execution times for comparison.</li>
     * </ol>
     * </p>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        int size = 10_000; // Number of random integers

        List<Integer> nums = new ArrayList<>();
        Random ran = new Random();

        // Generate random integers between 0 and 99
        for (int i = 1; i <= size; i++) {
            nums.add(ran.nextInt(100));
        }

        // Sequential stream
        long startSeq = System.currentTimeMillis();
        int sum1 = nums.stream()
                .map(i -> {
                    try {
                        Thread.sleep(1); // Simulate heavy computation
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    return i * 2;
                })
                .mapToInt(i -> i)
                .sum();
        long endSeq = System.currentTimeMillis();

        // Parallel stream
        long startPara = System.currentTimeMillis();
        int sum2 = nums.parallelStream()
                .map(i -> {
                    try {
                        Thread.sleep(1); // Simulate heavy computation
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    return i * 2;
                })
                .mapToInt(i -> i)
                .sum();
        long endPara = System.currentTimeMillis();

        // Output results
        System.out.println(sum1 + " " + sum2);
        System.out.println("Seq : " + (endSeq - startSeq) + " ms");
        System.out.println("Para : " + (endPara - startPara) + " ms");
    }
}
