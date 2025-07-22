package oops.encapsulation.accessmodifiers.external;

import oops.encapsulation.accessmodifiers.bank.BankAccount;

public class TestAccess { //non subclass

//    public static void main(String[] args) {


    public void show() {
        //Create an object to access non-static members
        BankAccount acc = new BankAccount();
        SavingsAccount sa = new SavingsAccount();

        System.out.println("Inside non subclass (different package): (Only public is accessible)");
        System.out.println("Holder: " + acc.accountHolder); //public
//         System.out.println("Balance: $" + acc.balance); // protected -not accessible
//        System.out.println("Account Type: " + acc.accountType); //default - not accessible
//        System.out.println("PIN: " + acc.pinCode); //private - not accessible

        sa.accessFields();
        acc.showDetails();
    }


//    }

}
