package oops.encapsulation;

/*
Create a Class Book:
Private attributes: bookID, title, author, isIssued (boolean).
Public methods:
issueBook()
returnBook()
getBookID()
getTitle()
getAuthor()
isIssued()

Create a Main Class:
Create instances of Book.
Issue and return books.
Display the status of each book.
*/

class Book {
    private String title, author;
    private int bookID;
    private boolean isIssued;

    public Book(String title, String author, int bookID) {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
        isIssued = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getBookID() {
        return bookID;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book Issued" + title + "has been issued");
        } else {
            System.out.println("Book Issued" + title + "is already issued");
        }
    }

    public void returnBook(){
        if (isIssued) {
            isIssued = false;
            System.out.println("Book Returned" + title + "has been returned");
        }else{
            System.out.println("Book Returned" + title + "is not issued");
        }
    }
}

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("Book 1", "Author 1", 1);
        Book book2 = new Book("Book 2", "Author 2", 2);

        displayBook(book1);
        displayBook(book2);

        book1.issueBook();
        book2.issueBook();

        displayBook(book1);
        displayBook(book2);

        book1.returnBook();
        book2.returnBook();

        displayBook(book1);
        displayBook(book2);
    }

    static void displayBook(Book book) {
        System.out.println("Title: " + book.getTitle() +" Author: " + book.getAuthor()+" Book ID: " + book.getBookID() + " ISSUED: " + ((book.isIssued())?"Yes":"No"));
    }
}
