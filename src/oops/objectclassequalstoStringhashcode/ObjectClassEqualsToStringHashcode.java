package oops.objectclassequalstoStringhashcode;

import java.util.Objects;

//Custom Class with Overridden Methods
class Person {
    private int id;
    private String name;

    // Constructor
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals() to compare content
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Same reference
        if (obj == null || getClass() != obj.getClass()) return false;

        Person other = (Person) obj;
        return id == other.id && Objects.equals(name, other.name);
    }

    // Override hashCode() to be consistent with equals()
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    // Override toString() to print object nicely
    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "'}";
    }
}

public class ObjectClassEqualsToStringHashcode {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Alice");
        Person p2 = new Person(1, "Alice");
        Person p3 = new Person(2, "Bob");

        // Check equality
        System.out.println("p1.equals(p2): " + p1.equals(p2)); // true
        System.out.println("p1.equals(p3): " + p1.equals(p3)); // false

        // Print hashCodes
        System.out.println("p1.hashCode(): " + p1.hashCode());
        System.out.println("p2.hashCode(): " + p2.hashCode());
        System.out.println("p3.hashCode(): " + p3.hashCode());

        // Print string representation
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);
    }
}