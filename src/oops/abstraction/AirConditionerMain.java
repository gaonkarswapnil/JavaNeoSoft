package oops.abstraction;

/*
Define an abstract class Appliance with an abstract method turnOn().
Define an interface Adjustable with a method adjustSetting().
Create a class AirConditioner that extends Appliance and implements Adjustable.
Write a main class to demonstrate the usage of AirConditioner.
*/

abstract class Appliance{
    abstract void turnOn();
}

interface Adjustable{
    void adjustSetting();
}

class AirConditioner extends Appliance implements Adjustable{

    @Override
    public void adjustSetting() {
        System.out.println("Adjusting air conditioner");
    }

    @Override
    void turnOn() {
        System.out.println("Turning on air conditioner");
    }
}

public class AirConditionerMain {
    public static void main(String[] args) {
        AirConditioner obj = new AirConditioner();
        obj.turnOn();
        obj.adjustSetting();
    }
}
