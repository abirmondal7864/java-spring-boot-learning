package oops;

class Human {
    private int age = 12;
    private String name = "Abir";

    //Constructor
    // write no return type,same name as class name
    //called automatically everytime an object created
    public Human(){  //default constructor
        age=13;
        name="John";
    }
    public Human(String name){  //parameterized constructor
        this.age=15;
        this.name=name;
    }
    public Human(int age,String name){  //parameterized constructor
        this.age=age;
        this.name=name;
    }


    public int getAge() { //getter
        return age;
    }
    public void setAge(int age) { //setter
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getName() + " : " + obj.getAge());
        Human obj1 = new Human("Akash");
        System.out.println(obj1.getName() + " : " + obj1.getAge());
        Human obj2=new Human(18,"Abir");
        System.out.println(obj2.getName() + " : " + obj2.getAge());
//        obj.setAge(12);
//        obj.setName("Mondal");
//        System.out.println(obj.getName() + " : " + obj.getAge());


    }
}
