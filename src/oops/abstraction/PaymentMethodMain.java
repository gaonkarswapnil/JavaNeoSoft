package oops.abstraction;


import java.util.ArrayList;
import java.util.List;

/**
 * Create an Abstract Class:
 * Define an abstract class PaymentMethod with abstract methods validate() and processPayment(double amount).
 * Create Interfaces:
 * Define an interface CardPayment with methods getCardNumber(), getExpiryDate(), and getCVV().
 * Define an interface DigitalWallet with methods getWalletID() and authenticate().
 * Create Payment Method Classes:
 * Create concrete classes CreditCard, DebitCard, and DigitalWalletPayment that extend PaymentMethod.
 * Implement the CardPayment interface in CreditCard and DebitCard.
 * Implement the DigitalWallet interface in DigitalWalletPayment.
 * Create a Payment Processor Class:
 * Create a class PaymentProcessor that can handle different types of payments.
 * Implement methods to add payment methods, validate them, and process payments.
 * Demonstration:
 * Write a main class to:
 * Create instances of CreditCard, DebitCard, and DigitalWalletPayment.
 * Use the PaymentProcessor to add these payment methods and demonstrate the validation and payment processing for each method.
 */

abstract  class PaymentMethod{
    String accountHolderName;

    public PaymentMethod(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    abstract  boolean validate();
    abstract void processPayment(double amount);
}

interface CardPayment{
    String getCardNumber();
    String getExpiryDate();
    String getCVV();
}

interface DigitalWallet{
    String getDigitalWallet();
    boolean authenticate();
}

class CreditCard extends PaymentMethod implements CardPayment{
    private String cardNumber, expiryDate, cvv;

    public CreditCard(String accountHolderName, String cardNumber, String cvv, String expiryDate) {
        super(accountHolderName);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public String getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String getCVV() {
        return cvv;
    }

    @Override
    boolean validate() {
        return cardNumber.length() == 16 && cvv.length() == 3;
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Account Holder Name: "+accountHolderName+" Credit Card Card Number: " + cardNumber + " Amount is: " + amount);
    }
}

class DebitCard extends PaymentMethod implements CardPayment{
    private String cardNumber, expiryDate, cvv;

    public DebitCard(String accountHolderName, String cardNumber, String expiryDate, String cvv) {
        super(accountHolderName);
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public String getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String getCVV() {
        return cvv;
    }

    @Override
    boolean validate() {
        return cardNumber.length()==16 && cvv.length()==3;
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Account Holder Name: "+accountHolderName+" Debit Card Card Number: " + cardNumber + " Amount is: " + amount);
    }
}

class DigitalWalletPayment extends PaymentMethod implements DigitalWallet{
    private String walletId;

    public DigitalWalletPayment(String accountHolderName, String walletId) {
        super(accountHolderName);
        this.walletId = walletId;
    }

    @Override
    public String getDigitalWallet() {
        return walletId;
    }

    @Override
    public boolean authenticate() {
        return true;
    }

    @Override
    boolean validate() {
        return walletId!=null && !walletId.isEmpty();
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Account Holder Name: "+accountHolderName+" Digital Wallet: " + walletId + " Amount is: " + amount);
    }
}

class PaymentProcessor{
    private List<PaymentMethod> paymentMethods;

    public PaymentProcessor() {
        this.paymentMethods = new ArrayList<>();
    }

    void addPaymentMethod(PaymentMethod paymentMethod){
        if(paymentMethod.validate()){
            paymentMethods.add(paymentMethod);
            System.out.println("Payment method added "+paymentMethod.getClass().getSimpleName());
        }else{
            System.out.println("Payment Method is not valid "+paymentMethod.getClass().getSimpleName());
        }
    }

    void processPayment(double amount){
        for(PaymentMethod paymentMethod : paymentMethods){
            paymentMethod.processPayment(amount);
        }
    }
}

public class PaymentMethodMain {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        PaymentMethod creditCard = new CreditCard("Swapnil","1234567890123456", "321","12/28");
        PaymentMethod  debitCard = new DebitCard("Author", "1234567890123456","10/24", "321");
        PaymentMethod digitalWalletPayment = new DigitalWalletPayment("Oliver", "12321");

        processor.addPaymentMethod(creditCard);
        processor.addPaymentMethod(debitCard);
        processor.addPaymentMethod(digitalWalletPayment);

        double paymentAmount = 2000.0;
        processor.processPayment(paymentAmount);



    }
}
