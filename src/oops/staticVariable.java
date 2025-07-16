package oops;

class Mobile {

    String brand;// Instance variable: unique for each Mobile object
    int price;
    static String name;// Static variable: shared by all Mobile objects


    // Instance method: operates on a specific Mobile object's instance data
    public void show() {
        System.out.println("Brand: " + brand + ", Price: " + price + ", Name: " + name);
    }

    // Static method: belongs to the Mobile class, can access static members directly.
    // To access instance members, it needs an object reference (like 'obj').
    public static void show1(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class staticVariable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile.name = "Smartphone";

// Change the static variable 'name' again. This affects ALL Mobile objects.
        Mobile.name = "Phone";

        // Call instance method on obj1: uses obj1's brand/price and current 'name'
        obj1.show();
        obj2.show();
// Call static method, passing obj1 to access its instance data
        Mobile.show1(obj1);

    }
}
