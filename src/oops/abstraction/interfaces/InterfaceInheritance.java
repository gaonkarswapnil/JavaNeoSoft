package oops.abstraction.interfaces;

/*
Define an interface Animal with a method makeSound().
Define another interface Pet that extends Animal and adds a method play().
Create a class Dog that implements Pet.
Write a main class to create an object of Dog and demonstrate calling both makeSound() and play() methods.
*/
interface Animal{
    void makeSound();
}

interface Pet extends Animal{
    void play();
}

class Dog implements Pet{

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.makeSound();
        obj.play();
    }
}
