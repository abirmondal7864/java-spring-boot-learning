package oops.polymorphism.compiletime;

class Mathutils {
 //Overloaded method 1
    int add(int n1, int n2) {
        return n1 + n2;
    }

 //Overloaded method 2
    double add(double n1, int n2) {
        return n1 + n2;
    }
 //Overloaded method 3
    int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        Mathutils mu=new Mathutils();
        System.out.println(mu.add(2,3)); //int version
        System.out.println(mu.add(2.5,4));//double version
        System.out.println(mu.add(2,3,5)); //3-int version
    }
}
