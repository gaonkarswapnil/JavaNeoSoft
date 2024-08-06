package oops.encapsulation;

class BankAccount {
    private String accountHolderName;
    private int accountNumber, balance;

    public BankAccount(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to " + accountHolderName);
        } else {
            System.out.println("Deposit must be positive");
        }
    }

    void withdraw(int amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from " + accountHolderName);
        } else if (balance < amount) {
            System.out.println("Insufficient balance");
        }else {
            System.out.println("Withdraw must be positive");
        }
    }

}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Oliver", 10, 100);
        account.deposit(400);
        account.deposit(-10);
        System.out.println(account.getBalance());

        account.withdraw(200);
        account.withdraw(300);
        System.out.println(account.getBalance());
//        account.withdraw(400);
    }
}
