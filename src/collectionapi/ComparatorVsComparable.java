package collectionapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Demonstrates the difference between Comparable and Comparator in Java.
 *
 * <p><b>Comparable:</b>
 * <ul>
 *   <li>Defines the natural ordering of objects.</li>
 *   <li>Implemented inside the class via {@code compareTo()}.</li>
 *   <li>In this example: Students are sorted by <b>age ascending</b>,
 *       and if ages are equal, then by <b>name ascending (A → Z)</b>.</li>
 * </ul>
 *
 * <p><b>Comparator:</b>
 * <ul>
 *   <li>Defines custom ordering outside the class.</li>
 *   <li>Implemented via {@code compare()} method.</li>
 *   <li>In this example: Students are sorted by <b>age descending</b>,
 *       and if ages are equal, then by <b>name descending (Z → A)</b>.</li>
 * </ul>
 */
class Student implements Comparable<Student> {
    int age;
    String name;

    /**
     * Constructor to initialize a Student.
     *
     * @param age  student's age
     * @param name student's name
     */
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * Defines the natural ordering of Student objects.
     * <p>
     * Rule:
     * <ul>
     *   <li>First by age in ascending order</li>
     *   <li>If age is the same, then by name in ascending order (A → Z)</li>
     * </ul>
     *
     * @param other another Student to compare with
     * @return negative if this < other, 0 if equal, positive if this > other
     */
    @Override
    public int compareTo(Student other) {
        if (this.age == other.age) {
            return this.name.compareTo(other.name); // tie-breaker by name ascending
        } else if (this.age > other.age) {
            return 1;   // larger age considered "greater"
        } else {
            return -1;  // smaller age considered "less"
        }
    }

    /**
     * Returns a string representation of the Student.
     */
    @Override
    public String toString() {
        return "Student [age= " + age + ", name= " + name + "]";
    }
}

/**
 * Main class to test Comparable and Comparator with Student objects.
 */
public class ComparatorVsComparable {
    public static void main(String[] args) {

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(23, "Abir"));
        studs.add(new Student(21, "Ravi"));
        studs.add(new Student(23, "Kiran"));
        studs.add(new Student(20, "Zara"));

        // ----------- Comparable Example -----------
        System.out.println("=== Comparable (Age Ascending, Name Ascending) ===");
        Collections.sort(studs); // uses compareTo()
        for (Student s : studs) {
            System.out.println(s);
        }

        // ----------- Comparator Example -----------
        System.out.println("\n=== Comparator (Age Descending, Name Descending) ===");
        Comparator<Student> customComparator = new Comparator<Student>() {
            /**
             * Defines custom ordering for Student objects.
             * <p>
             * Rule:
             * <ul>
             *   <li>First by age in descending order</li>
             *   <li>If age is the same, then by name in descending order (Z → A)</li>
             * </ul>
             *
             * @param i first Student
             * @param j second Student
             * @return negative if i < j, 0 if equal, positive if i > j
             */
            @Override
            public int compare(Student i, Student j) {
                if (i.age == j.age) {
                    return j.name.compareTo(i.name); // tie-breaker by name descending
                } else if (i.age > j.age) {
                    return -1; // larger age first
                } else {
                    return 1;  // smaller age later
                }
            }
        };

        Collections.sort(studs, customComparator);
        for (Student s : studs) {
            System.out.println(s);
        }
    }
}
