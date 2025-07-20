package statickeyword;

class Mobile {

    String brand;// Instance variable: unique for each Mobile object
    int price;
    static String name;// Static variable: shared by all Mobile objects

    // Constructor: Called when a new object of Mobile is created
    public Mobile() {
        name = "";// This assignment happens every time an object is created
        price = 200;
        System.out.println("in constructor");
    }

    // Static block: Executed only once when the class is loaded into memory
    static {
        name = "Phone";// Initial assignment to static variable
        System.out.println("in static block");
    }


//    // Instance method: operates on a specific Mobile object's instance data
//    public void show() {
//        System.out.println("Brand: " + brand + ", Price: " + price + ", Name: " + name);
//    }

//    // Static method: belongs to the Mobile class, can access static members directly.
//    // To access instance members, it needs an object reference (like 'obj').
//    public static void show1(Mobile obj) {
//        System.out.println(obj.brand + " : " + obj.price + " : " + name);
//    }
}

public class staticVariable {
    public static void main(String[] args) throws ClassNotFoundException {

        // Explicitly loads the 'Mobile' class into memory.
        // This triggers the execution of the static block.
        Class.forName("statickeyword.Mobile");


//        Mobile obj1 = new Mobile();
//        obj1.brand = "Apple";
//        obj1.price = 1500;
//        Mobile.name = "Smartphone";
//
//        Mobile obj2 = new Mobile();
//        obj2.brand = "Samsung";
//        obj2.price = 1700;
//        Mobile.name = "Smartphone";
//
// Change the static variable 'name' again. This affects ALL Mobile objects.
//        Mobile.name = "Phone";
//
//        // Call instance method on obj1: uses obj1's brand/price and current 'name'
//        obj1.show();
//        obj2.show();
// Call static method, passing obj1 to access its instance data
//        Mobile.show1(obj1);

    }
}
