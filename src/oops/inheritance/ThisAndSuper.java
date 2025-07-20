package oops.inheritance;

// Class A extends Object (implicitly, but shown explicitly here)
class A extends Object {
    public A() {
        super();// Calls the constructor of Object class (implicit, can be omitted)
        System.out.println("in A");
    }

    public A(int n) {
        super();
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("in B");
    }

    public B(int n) {
        this(); // Calls default constructor of the same class (i.e., B())
        System.out.println("in B int");
    }
}


public class ThisAndSuper {
    public static void main(String[] args) {
        B obj = new B(5);

    }
}
