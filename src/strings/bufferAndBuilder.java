package strings;

public class bufferAndBuilder {
    public static void main(String[] args) {

        //StringBuffer

        // StringBuffer is a thread-safe, mutable sequence of characters.
        // It is suitable for scenarios where multiple threads might modify the string concurrently.

        StringBuffer sb=new StringBuffer("Abir");
        //System.out.println(sb.capacity()); //16+4=20
        //System.out.println(sb.length()); //4

        sb.append(" Mondal");
        System.out.println(sb); //Abir Mondal
        sb.deleteCharAt(2);
        System.out.println(sb); //Abr Mondal
        sb.insert(3,"Java");
        System.out.println(sb); //AbrJava Mondal

        sb.setLength(30);// Sets the length of the StringBuffer to 30
        System.out.println(sb);
        sb.ensureCapacity(100); // Ensures that the capacity of the buffer is at least the specified minimum.
        System.out.println(sb);



        //StringBuilder (conceptually similar)

        // StringBuilder is similar to StringBuffer but is not thread-safe.
        // It is generally faster than StringBuffer for single-threaded environments because it does not have the overhead of synchronization.
         StringBuilder sb2 = new StringBuilder("Hello");
         sb2.append(" World");
         System.out.println(sb2);
    }

}
