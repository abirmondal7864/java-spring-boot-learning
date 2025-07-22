package oops.encapsulation.accessmodifiers.bank;

public class BankAccount {
    public String accountHolder = "Abir";
    protected double balance = 5000.0;
    String accountType = "Savings"; //default
    private String pinCode = "1234";

    public void showDetails() {
        System.out.println("Inside BankAccount Class: (All are accessible)");
        System.out.println("Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
        System.out.println("Account Type: " + accountType);
        System.out.println("PIN: " + pinCode);

    }
}
