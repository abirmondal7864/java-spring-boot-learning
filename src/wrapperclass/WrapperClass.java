package wrapperclass;

public class WrapperClass {
    public static void main(String[] args) {
        //Auto-boxing
        int num = 5;
        Integer num1 = num; //automatically converts a primitive type into its corresponding wrapper class object

        //Auto-unboxing
        int num2 = num1; //automatically converts an object of a wrapper class back to its primitive type
        System.out.println(num2);

        //parseInt
        String str = "57";
        int num3 = Integer.parseInt(str); //converts a string (of no.s) to an int
        System.out.println(num3);
    }
}
