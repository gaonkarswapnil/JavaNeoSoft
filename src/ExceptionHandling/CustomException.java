package ExceptionHandling;

class InsufficinetFundsException extends Exception {
    public InsufficinetFundsException(String message) {
        super(message);
    }
}

class InvalidAccountException extends Exception {
    public InvalidAccountException(String message) {
        super(message);
    }
}

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void withdraw(double amount) throws InsufficinetFundsException {
        if (amount > balance) {
            throw new InsufficinetFundsException("InsufficinetFundsException");
        } else {
            balance -= amount;
        }
    }

    public void deposit(double amount){
        balance += amount;
    }
}

class Bank {
    public void transfer(BankAccount fromAccount, BankAccount toAccount, double amount) throws InvalidAccountException, InsufficinetFundsException {
        if(fromAccount == null || toAccount == null){
            throw new InsufficinetFundsException("Invalid account number");
        }
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }
}

public class CustomException {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123", 100.0);
        BankAccount account2 = new BankAccount("456", 200.0);
        Bank bank = new Bank();

        try {
            bank.transfer(account1, account2,50);

            System.out.println(account1.getBalance());
            System.out.println(account2.getBalance());

            bank.transfer(account1, account2, 100);
            System.out.println(account1.getBalance());
            System.out.println(account2.getBalance());
        } catch (InvalidAccountException e) {
//            throw new RuntimeException(e);
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficinetFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
