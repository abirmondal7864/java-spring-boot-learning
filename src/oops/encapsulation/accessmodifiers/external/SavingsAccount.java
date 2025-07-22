package oops.encapsulation.accessmodifiers.external;

import oops.encapsulation.accessmodifiers.bank.BankAccount;

public class SavingsAccount extends BankAccount { //subclass

    public void accessFields() {
        System.out.println("Inside subclass (different package): (Only public and protected accessible)");
        System.out.println("Holder: " + accountHolder); //public
        System.out.println("Balance: $" + balance); // protected***
//        System.out.println("Account Type: " + accountType); //default - not accessible
//        System.out.println("PIN: " + pinCode); //private - not accessible
    }

}
