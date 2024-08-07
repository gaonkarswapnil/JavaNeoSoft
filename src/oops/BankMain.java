package oops;

import java.util.ArrayList;

abstract class BankAccount {
    private String accountNumber, accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}

class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double calculateInterestRate() {
        return getBalance() * interestRate / 100;
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

abstract class BankService {
    public abstract void openAccount(BankAccount account);

    public abstract void performDeposit(String accountNumber, double amount);

    public abstract void performWithdrawal(String accountNumber, double amount);
}

class Bank extends BankService {
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    @Override
    public void openAccount(BankAccount account) {
        accounts.add(account);
    }

    @Override
    public void performDeposit(String accountNumber, double amount) {
        for (BankAccount account : accounts) {
//            System.out.println(account.getAccountNumber());
            if (account.getAccountNumber().equals(accountNumber)) {
                if (amount > 0) {
                    account.deposit(amount);
                } else {
                    System.out.println("Enter positive Number");
                }
            }
        }
    }

    @Override
    public void performWithdrawal(String accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                if (amount <= account.getBalance() && amount > 0) {
                    account.withdraw(amount);
                } else if (amount > account.getBalance()) {
                    System.out.println("Withdrawal failed! Insufficient funds");
                } else {
                    System.out.println("Enter positive number");
                }
            }
//            else {
//                System.out.println("Account number does not match");
//            }
        }
    }
}

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingAccount savingAccount = new SavingAccount("123","Account1",500, 5.0);
        bank.openAccount(savingAccount);
        displayAccountsDetails(savingAccount);
        System.out.println(" Rate of interest "+savingAccount.calculateInterestRate());
        bank.performWithdrawal("123", 450);
        displayAccountsDetails(savingAccount);
        System.out.println(" Rate of interest "+savingAccount.calculateInterestRate());
        bank.performDeposit("123", 50);
        displayAccountsDetails(savingAccount);
        System.out.println(" Rate of interest "+savingAccount.calculateInterestRate());


        CheckingAccount checkingAccount = new CheckingAccount("789","Account2",100, 2.0);
        bank.openAccount(checkingAccount);
        displayAccountsDetails(checkingAccount);
        System.out.println();
        bank.performWithdrawal("789", 100);
        displayAccountsDetails(checkingAccount);
        System.out.println();
        bank.performDeposit("789", 100);
//        bank.openAccount(checkingAccount);
        displayAccountsDetails(checkingAccount);
    }

    public static void displayAccountsDetails(BankAccount account) {
        System.out.print(" Account Number: " + account.getAccountNumber());
        System.out.print(" Account Holder Name: " + account.getAccountHolderName());
        System.out.print(" Balance: " + account.getBalance());
    }
}
