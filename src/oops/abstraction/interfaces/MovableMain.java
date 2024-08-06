package oops.abstraction.interfaces;

/*
Define an interface Movable with methods moveForward() and moveBackward().
Create two classes Car and Robot that implement the Movable interface.
Write a main class to create objects of Car and Robot and call their methods.
*/

interface Movable{
    void moveForward();
    void moveBackward();
}

class Car implements Movable{

    @Override
    public void moveForward() {
        System.out.println("Car is Moving Forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("Car is Moving Backward");
    }
}

class Robot implements Movable{

    @Override
    public void moveForward() {
        System.out.println("Robot is Moving Forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("Robot is Moving Backward");
    }
}

public class MovableMain {
    public static void main(String[] args) {
        Movable car = new Car();
        car.moveForward();
        car.moveBackward();

        Movable robot = new Robot();
        robot.moveForward();
        robot.moveBackward();
    }
}
