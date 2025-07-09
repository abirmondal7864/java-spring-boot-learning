package classesAndObjects;

class Calculator {
    //int a;
    public int add(int n1,int n2){
        return n1+n2;
    }
}

public class classAndObject {
    public static void main(String[] args) {
        int num1= 4;
        int num2 = 8;
        Calculator calc= new Calculator();  //like Scanner sc=new Scanner(System.in)
        int ans = calc.add(num1,num2);
        System.out.println(ans);
    }
}
