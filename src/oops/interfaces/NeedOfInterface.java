// File: NeedOfInterface.java
package oops.interfaces;

/*
  Interface: Computer
  --------------------
  Declares the 'code()' method that must be implemented by any class
  representing a computing device. Promotes abstraction and loose coupling.
 */
interface Computer {
    void code(); // implicitly public and abstract
}

/*
  Laptop implements the Computer interface
 */
class Laptop implements Computer {
    @Override
    public void code() {
        System.out.println("Works with Laptop");
    }
}

/*
  Desktop implements the Computer interface
 */
class Desktop implements Computer {
    @Override
    public void code() {
        System.out.println("Works with Desktop");
    }
}

/*
  Developer class
  ----------------
  Depends on the Computer interface, not on any concrete implementation.
  This makes the class more flexible and testable.
 */
class Developer {
    public void devApp(Computer machine) {
        machine.code();  // Can work with any Computer implementation
    }
}

/*
  Main class to demonstrate the use and benefits of interfaces
 */
public class NeedOfInterface {
    public static void main(String[] args) {
        // Create objects using the interface reference
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        // Developer is decoupled from specific Computer implementations
        Developer abir = new Developer();
        abir.devApp(lap);   // Output: Works with Laptop
        abir.devApp(desk);  // Output: Works with Desktop

        // This follows the Dependency Inversion Principle — one of the SOLID principles of OOP.
    }
}
