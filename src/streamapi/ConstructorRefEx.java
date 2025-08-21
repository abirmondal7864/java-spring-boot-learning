package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Represents a student with a name and age.
 */
class Student {
    private String name;
    private int age;

    /**
     * Default constructor.
     */
    public Student() {
    }

    /**
     * Constructor to create a Student with a specific name.
     *
     * @param name The name of the student.
     */
    public Student(String name) {
        this.name = name;
    }

    /**
     * Returns the age of the student.
     *
     * @return age of the student.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the student.
     *
     * @param age Age to set for the student.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns the name of the student.
     *
     * @return name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the student.
     *
     * @param name Name to set for the student.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a string representation of the student object.
     *
     * @return string representation including name and age.
     */
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

/**
 * Demonstrates usage of constructor references in Java Streams.
 */
public class ConstructorRefEx {

    /**
     * Main method demonstrating creating Student objects using:
     * 1. For-each loop
     * 2. Lambda expression in Streams
     * 3. Constructor reference in Streams
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // List of student names
        List<String> names = Arrays.asList("Abhradeep","Debayan","Pratik","Debarghya");
        List<Student> students = new ArrayList<>();

//        // 1. Using traditional for-each loop
//        for(String name : names) students.add(new Student(name));
//        System.out.println(students);
//
//        // 2. Using lambda expression with streams
//        students = names.stream().map(name -> new Student(name)).toList();
//        System.out.println(students);

        // 3. Using constructor reference with streams***
        students = names.stream().map(Student::new).toList();
        System.out.println(students);
    }
}
