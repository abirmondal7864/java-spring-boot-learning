package oops.innerclass;

// Parent class A
class A {
    public void show() {
        System.out.println("in A show");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {

        // Creating an object of an anonymous inner class that extends class A
        // and overrides the show() method
        A obj = new A() {
            // This is an anonymous inner class
            // It overrides the show() method of class A
            public void show() {
                System.out.println("in new show");
            }
        };

        // Calls the overridden method in the anonymous inner class
        obj.show();
    }
}
