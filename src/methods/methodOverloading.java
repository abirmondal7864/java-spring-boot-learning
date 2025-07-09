package methods;

class CalculatorAdvanced{
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public int add(int n1,int n2){
        return n1+n2;
    }
    public double add(double n1,int n2){
        return n1+n2;
    }
}

public class methodOverloading {
    public static void main(String[] args){
        int a = 5;
        int b = 8;
        CalculatorAdvanced calc = new CalculatorAdvanced();
        int r1 = calc.add(a, b);
        System.out.println(r1);
    }
}
