package lambdaexpression;

/**
 * Functional interface representing a simple addition operation.
 * <p>
 * This interface is annotated with {@code @FunctionalInterface},
 * meaning it can be implemented using a lambda expression or a method reference.
 */
@java.lang.FunctionalInterface
interface A {

    /**
     * Adds two integers and returns the result.
     *
     * @param i the first integer
     * @param j the second integer
     * @return the sum of {@code i} and {@code j}
     */
    int add(int i, int j);
}

/**
 * Demonstrates the usage of a lambda expression in Java
 * to implement a functional interface.
 * <p>
 * In this example, the functional interface {@link A} is implemented
 * using a lambda expression to perform integer addition.
 */
public class LambdaExpression {

    /**
     * The main entry point of the program.
     *
     * @param args the command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Implementing interface A using a lambda expression
        A obj = (i, j) -> i + j;

        // Invoking the lambda to add two integers
        int result = obj.add(5, 4);

        // Printing the result to the console
        System.out.println(result);
    }
}
