package oops.abstraction;

import java.util.SimpleTimeZone;

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
