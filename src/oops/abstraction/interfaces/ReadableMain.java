package oops.abstraction.interfaces;

/*
Define an interface Readable with a default method open() and a static method read().
Create a class Book that implements Readable.
Override the open() method in Book.
Write a main class to demonstrate calling the default and static methods.
*/

interface Readable{
    default void open(){
        System.out.println("Open readable");
    }

    static void read(){
        System.out.println("read readable");
    }
}

class Book implements Readable{
    @Override
    public void open() {
//        Readable.super.open();
        System.out.println("Open Book");
    }
}

public class ReadableMain {
    public static void main(String[] args) {
        Readable book = new Book();
        book.open();
        Readable.read();
    }
}
