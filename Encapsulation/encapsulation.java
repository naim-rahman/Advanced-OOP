class BankAccount {

    private String accountHolder;
    private double balance;

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful");
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}


public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setAccountHolder("Naim");

        account.deposit(5000);

        account.withdraw(2000);

        System.out.println("Name : " + account.getAccountHolder());

        System.out.println("Balance : " + account.getBalance());
    }
}