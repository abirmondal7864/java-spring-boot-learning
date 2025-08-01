package oops.abstraction;

// Abstract base class defining the blueprint for all cars
abstract class Car {
    // Abstract methods to be implemented by subclasses
    public abstract void drive();
    public abstract void fly();

    // Concrete method with default implementation
    public void playMusic() {
        System.out.println("Playing music...");
    }
}

// Partially implemented abstract subclass
abstract class WagonR extends Car {
    // Implements only the drive() method
    public void drive() {
        System.out.println("Driving...");
    }
}

// Concrete subclass that completes the implementation
class UpdatedWagonR extends WagonR {
    // Implements the remaining abstract method
    public void fly() {
        System.out.println("Flying...");
    }
}

// Main class with entry point
public class AbstractKeyword {
    public static void main(String[] args) {
        // Upcasting to abstract class reference
        Car obj = new UpdatedWagonR();
        obj.playMusic();  // Calls concrete method
        obj.drive();      // Calls implemented method in WagonR
        obj.fly();        // Calls implemented method in UpdatedWagonR
    }
}
