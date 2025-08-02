package oops.innerclass;

class Outer {
    int age;  // instance variable

    // Method of outer class
    public void show() {
        System.out.println("In show");
    }

    // Static keyword means this class does not depend on an instance of outer class
    static class Inner {
        public void config() {
            System.out.println("In config");
        }
    }
}

// Main class
public class InnerClass {
    public static void main(String[] args) {
        // Creating object of outer class
        Outer obj = new Outer();
        obj.show();  // Calling method of outer class

        // Creating object of static inner class using outer class name
        Outer.Inner obj1 = new Outer.Inner();  // No need to create object of outer class for static inner class
        obj1.config();  // Calling method of inner class
    }
}
