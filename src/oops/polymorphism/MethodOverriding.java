package oops.polymorphism;

// Base class (Superclass)
class Animal {
    // This method will be overridden in the subclass
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class (Subclass)
class Dog extends Animal {
    // Overriding the sound() method of the superclass
    @Override // Optional but recommended for clarity and error checking
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // Creating a Dog object but referencing it as an Animal (polymorphism)
        Animal myPet = new Dog();

        // Calls the overridden method in the Dog class, not Animal
        myPet.sound(); // Output: Dog barks
    }
}
