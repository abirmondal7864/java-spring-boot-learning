package oops.finalkeyword;

public class FinalKeyword {

//1. Final Variable
//    Once assigned, its value cannot be changed. It makes the variable a constant.
    final int x = 10;
   // x = 20; // Error: cannot assign a value to final variable 'x'

}

//2. Final Method
//Prevents the method from being overridden in a subclass.
class A{
    final void display(){
        System.out.println("A");
    }
}
class B extends A{
   // void display(){}// Error: cannot override final method
}

//3. Final Class
//Prevents the class from being inherited (no subclassing).

final class C{

}
//class  D extends C{ }// Error: cannot inherit from final class
