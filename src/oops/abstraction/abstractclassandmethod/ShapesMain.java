package oops.abstraction.abstractclassandmethod;

/*
Define an abstract class Shape with an abstract method calculateArea().
Create two subclasses Circle and Rectangle that extend Shape.
Implement the calculateArea() method in both subclasses.
Write a main class to create objects of Circle and Rectangle and display their areas.
*/

abstract class Shape{
    abstract void calculateArea();
}

class Circle extends Shape{
    double r;
    final double pi = 3.14;
    @Override
    void calculateArea() {
        System.out.println("Area of circle is: "+(pi*r*r));
    }
}
class Rectangle extends Shape{
    double length, breadth;
    @Override
    void calculateArea() {
        System.out.println("Area if rectangle is: "+(length*breadth));
    }
}

public class ShapesMain {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.r = 1.3;
        c.calculateArea();

        Rectangle r = new Rectangle();
        r.length = 10;
        r.breadth = 10;
        r.calculateArea();
    }
}
