package oops;

class Human {
    private int age = 12;
    private String name = "Abir";

    public int getAge() { //getter
        return age;
    }

    public void setAge(int a) { //setter
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(12);
        obj.setName("Mondal");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
