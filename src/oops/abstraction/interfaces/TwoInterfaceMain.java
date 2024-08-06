package oops.abstraction.interfaces;

/*
Define two interfaces Flyable and Swimmable with methods fly() and swim(), respectively.
Create a class Duck that implements both interfaces.
Write a main class to create an object of Duck and call its methods.
*/

interface Flyable{
    void fly();
}

interface Swimmable{
    void swim();
}

class Duck implements Flyable, Swimmable{

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}

public class TwoInterfaceMain {
    public static void main(String[] args) {
        Duck obj = new Duck();
        obj.fly();
        obj.swim();
    }
}
