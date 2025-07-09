package methods;

class Computer{
    public void playmusic(){
        System.out.println("Music playing...");
    }
    public String getMeAPen(int cost){
        if(cost>=10)
            return "Pen fetched";
        return "Nothing fetched";
    }

}

public class methods {
    public static void main(String[] a){
    Computer comp=new Computer();
    comp.playmusic();

     int money=20;
     String result=comp.getMeAPen(money);
     System.out.println(result);
    }
}
