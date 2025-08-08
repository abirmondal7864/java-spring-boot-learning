package oops.interfaces;

// A functional interface is an interface that has a single abstract method.
// The @FunctionalInterface annotation is a good practice to ensure that
// the interface adheres to this rule.
@java.lang.FunctionalInterface

/*
  E is a functional interface with a single method, show().
 */
interface E {
    void show();
}

/**
 * {@code FunctionalInterface} is a class that demonstrates the use of a functional interface
 * with an anonymous inner class.
 */
public class FunctionalInterface {

    /**
     * The main method is the entry point of the application.
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {

        // Here we're creating an instance of the interface E using an anonymous inner class.
        // This is an older way of implementing a functional interface.
        E obj = new E() {
            @Override
            public void show() {
                System.out.println("in show");
            }
        };
        // Calling the show() method on the obj instance.
        obj.show();
    }
}