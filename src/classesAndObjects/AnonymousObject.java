package classesAndObjects;
class A{
    public A() { //constructor
        System.out.println("object created");
    }
    public void show(){
        System.out.println("in a show");
    }
}
public class AnonymousObject {
    public static void main(String[] args) {

        new A().show(); //anonymous object
        new A().show(); //anonymous object (another)
    }
}
