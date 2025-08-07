package oops.interfaces;

/*
  Interface A demonstrates a basic Java interface with two abstract methods
  and two constants (implicitly public, static, and final).
 */
interface A {
    // Constants (public, static, and final by default in interfaces)
    int age = 23;
    String city = "Kalyani";

    // Methods (public and abstract by default) //must be overridden
    void show();
    void config();
}

/*
  Class B implements interface A and provides definitions for its abstract methods.
 */
class B implements A {

    // Implementing the 'show' method
    @Override
    public void show() {
        System.out.println("In show");
    }

    // Implementing the 'config' method
    @Override
    public void config() {
        System.out.println("In config");
    }
}

/*
  Main class to demonstrate the use of interface and implementation.
 */
public class Interface {
    public static void main(String[] args) {
        // Declare interface reference and instantiate with implementing class
        A obj = new B();

        // Call implemented methods
        obj.show();
        obj.config();

        // Access interface constants
        System.out.println(A.age);
        System.out.println(A.city);
    }
}
