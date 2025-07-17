package oops;

class Human {
    private int age = 12;
    private String name = "Abir";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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
        obj.setAge(12);
        obj.setName("Mondal");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
