package oops.polymorphism.runtime;
class A{
    void show(){
        System.out.println("in A show");
    }
}
class B extends A{
    void show(){
        System.out.println("in B show");
    }
}
class C extends A{
    void show(){
        System.out.println("in C show");

    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A obj; //reference of superclass
        obj=new A();
        obj.show();

        obj=new B(); //Object of subclass B
        obj.show(); //B's version of show

        obj=new C(); //Now object is C
        obj.show(); //C's version of show
    }
}
