package oops.inheritance;

abstract class LibraryItem{
    private String itemID, title;
    private int borrowDuration;

    public LibraryItem(String itemID, String title, int borrowDuration) {
        this.itemID = itemID;
        this.title = title;
        this.borrowDuration = borrowDuration;
    }

    public String getItemID() {
        return itemID;
    }

    public String getTitle() {
        return title;
    }

    public int getBorrowDuration() {
        return borrowDuration;
    }

    public abstract double calculateLateFee(int daysLate);
}

class Book extends LibraryItem{

    public Book(String itemID, String title, int borrowDuration) {
        super(itemID, title, borrowDuration);
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate*0.5;
    }
}

class Magazine extends LibraryItem{

    public Magazine(String itemID, String title, int borrowDuration) {
        super(itemID, title, borrowDuration);
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate*0.25;
    }
}

class DVD extends LibraryItem{

    public DVD(String itemID, String title, int borrowDuration) {
        super(itemID, title, borrowDuration);
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate*1.00;
    }
}

public class LibraryMain {
    public static void main(String[] args) {
        LibraryItem book = new Book("Book Title", "Book Author", 10);
        LibraryItem magazine = new Magazine("Magazine Title", "Magazine Author", 10);
        LibraryItem dvd = new DVD("DVD Title", "DVD Author", 10);
        System.out.println("Fees for Book is "+book.calculateLateFee(2));
        System.out.println("Fees for Magazine is "+magazine.calculateLateFee(2));
        System.out.println("Fees for DVD is "+dvd.calculateLateFee(8));
    }
}
