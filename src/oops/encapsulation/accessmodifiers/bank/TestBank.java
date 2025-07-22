package oops.encapsulation.accessmodifiers.bank;
import oops.encapsulation.accessmodifiers.external.TestAccess;

public class TestBank {

    public static void main(String[] args) {

            BankAccount ba= new BankAccount();
            System.out.println("Inside non subclass (same package): (only public, protected, default are accessible)");
            System.out.println("Holder: " + ba.accountHolder); //public
            System.out.println("Balance: $" + ba.balance);// protected
            System.out.println("Account Type: " + ba.accountType);//default
//            System.out.println("PIN: " + ba.pinCode); //private - not accessible


        TestAccess ta =new TestAccess();
        ta.show();
    }
}
