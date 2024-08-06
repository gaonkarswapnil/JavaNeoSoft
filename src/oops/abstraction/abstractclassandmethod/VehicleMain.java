package oops.abstraction.abstractclassandmethod;

/*
Define an abstract class Vehicle with an abstract method startEngine().
Create subclasses Car, Bike, and Truck that extend Vehicle.
Implement the startEngine() method in each subclass with specific messages.
Write a main class to demonstrate polymorphism by calling startEngine() on different vehicle objects.
*/

abstract class Vehicle{
    abstract void startEngine();
}

class Car extends Vehicle{

    @Override
    void startEngine() {
        System.out.println("Car starts engine");
    }
}

class Bike extends Vehicle{

    @Override
    void startEngine() {
        System.out.println("Bike starts engine");
    }
}

class Truck extends Vehicle{

    @Override
    void startEngine() {
        System.out.println("Truck starts engine");
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine();
        Vehicle bike = new Bike();
        bike.startEngine();
        Vehicle truck = new Truck();
        truck.startEngine();
    }
}
