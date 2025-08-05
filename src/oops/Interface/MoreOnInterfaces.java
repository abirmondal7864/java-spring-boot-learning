// File: MoreOnInterfaces.java
package oops.Interface;

// Relationships:
// class - class         → extends
// interface - class     → implements
// interface - interface → extends

// Interface C defines two abstract methods
interface C {
    void show();
    void config();
}

// Interface X defines one abstract method
interface X {
    void run();
}

// Interface Y extends X
interface Y extends X {
    // Y inherits method `run()` from X
}

// Class D implements C and Y
// Y extends X, so D must implement all methods from C and X
class D implements C, Y {

    @Override
    public void show() {
        System.out.println("in show");
    }

    @Override
    public void config() {
        System.out.println("in config");
    }

    @Override
    public void run() {
        System.out.println("running...");
    }
}

// Main class to demonstrate polymorphism with interfaces
public class MoreOnInterfaces {
    public static void main(String[] args) {
        // C reference can only access methods defined in interface C
        C obj = new D();
        obj.show();
        obj.config();
        // obj.run(); //Compile-time error: run() is not in interface C

        // Y reference (inherits run() from X) can access run()
        Y obj1 = new D();
        obj1.run(); //This works because run() is in interface Y (via X)
    }
}
