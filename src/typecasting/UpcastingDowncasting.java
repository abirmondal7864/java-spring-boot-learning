package typecasting;

class A{
    void show1(){
        System.out.println("in A show");
    }
}
class B extends A{
    void show2(){
        System.out.println("in B show");
    }
}
public class UpcastingDowncasting {
    public static void main(String[] args) {
        //Upcasting
        A obj=new B();
        obj.show1(); //in A show

        //Downcasting
        B obj1 = (B) obj;
        obj1.show1(); //in A show
    }
}
