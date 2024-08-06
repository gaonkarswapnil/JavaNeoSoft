package oops.abstraction;

/*
Create an Abstract Class:
Define an abstract class SmartDevice with abstract methods turnOn() and turnOff().

Create Interfaces:
Define an interface Adjustable with methods increaseSetting() and decreaseSetting().
Define an interface TemperatureControllable with methods setTemperature(double temperature).

Create Smart Devices:
Create concrete classes SmartLight and SmartThermostat that extend SmartDevice.
Implement the Adjustable interface in SmartLight and the TemperatureControllable interface in SmartThermostat.

Create a Controller Class:
Create a class SmartHomeController that manages a list of SmartDevice objects.
Implement methods to turn all devices on and off, and to adjust settings for devices that support Adjustable or TemperatureControllable.

Demonstration:
Write a main class to:
Create instances of SmartLight and SmartThermostat.
Use SmartHomeController to control the devices and demonstrate their functionalities.
*/

abstract class SmartDevice{
    abstract void turnOn();
    abstract void turnOff();
}

interface AdjustableInterface{
    void increaseSetting();
    void decreaseSetting();
}

interface TemperatureController{
    void setTemperature(double temperature);
}

class SmartLight extends SmartDevice implements AdjustableInterface{

    @Override
    public void increaseSetting() {
        System.out.println("Smart Light Increasing setting");
    }

    @Override
    public void decreaseSetting() {
        System.out.println("Smart Light Decreasing setting");
    }

    @Override
    void turnOn() {
        System.out.println("Smart Light Turning on");
    }

    @Override
    void turnOff() {
        System.out.println("Smart Light Turning off");
    }
}

class SmartThermostat extends SmartDevice implements TemperatureController{

    @Override
    void turnOn() {
        System.out.println("Smart thermostat turning on"); ;
    }

    @Override
    void turnOff() {
        System.out.println("Smart thermostat turning off");
    }

    @Override
    public void setTemperature(double temperature) {
        System.out.println("Temp "+temperature);
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        SmartLight smartLight = new SmartLight();
        smartLight.increaseSetting();
        smartLight.turnOn();
        smartLight.turnOff();
        smartLight.decreaseSetting();

        SmartThermostat smartThermostat = new SmartThermostat();
        smartThermostat.turnOn();
        smartThermostat.turnOff();
        smartThermostat.setTemperature(37);
    }
}
