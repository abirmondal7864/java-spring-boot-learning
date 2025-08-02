package oops.innerclass;

// Abstract class with two abstract methods
abstract class C {
    public abstract void show();

    public abstract void config();
}

public class AbstractAndAnonymousInnerClass {
    public static void main(String[] args) {

        // Creating an anonymous inner class that extends abstract class C
        // and provides implementation for both abstract methods
        C obj = new C() {
            public void show() {
                System.out.println("in new show");
            }

            public void config() {
                System.out.println("in config");
            }
        };

        // Calling the overridden methods
        obj.show();
        obj.config();
    }
}
