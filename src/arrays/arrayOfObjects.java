package arrays;
class Student {
    int roll;
    String name;
    int age;

}
public class arrayOfObjects {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.roll=1;
        s1.name="Abir";
        s1.age=10;

        Student s2=new Student();
        s2.roll=2;
        s2.name="Sounak";
        s2.age=8;

        Student s3=new Student();
        s3.roll=3;
        s3.name="Akash";
        s3.age=12;

        Student []students= new Student[3];//creating an array that can hold 3 references to Student objects.


        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

//        for (int i = 0; i < students.length; i++) {
//            System.out.println("Name: "+ students[i].name+", Roll: "+ students[i].roll+", Age: "+ students[i].age);
//        }

        //use enhanced for loop
        for(Student stud:students){
            System.out.println("Name: "+ stud.name+", Roll: "+ stud.roll+", Age: "+ stud.age);
        }

    }
}
