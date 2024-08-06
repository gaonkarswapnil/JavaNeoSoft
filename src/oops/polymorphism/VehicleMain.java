package oops.polymorphism;

abstract class Vehicle {
    private String vechileID, model;

    public Vehicle(String vechileID, String model) {
        this.vechileID = vechileID;
        this.model = model;
    }

    public String getVechileID() {
        return vechileID;
    }

    public String getModel() {
        return model;
    }

    public abstract double calculateRentalCost(int days);
    public abstract double calculateLateFees(int lateDays);
}

class Car extends Vehicle {
    private final double rentalCost = 10.0;
    private final double lateFees = 15.0;

    public Car(String vechileID, String model) {
        super(vechileID, model);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days*rentalCost;
    }

    @Override
    public double calculateLateFees(int lateDays) {
        return lateDays*lateFees;
    }
}

class Bike extends Vehicle {
    private final double rentalCost = 5.0;
    private final double lateFees = 10.0;
    public Bike(String vechileID, String model) {
        super(vechileID, model);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days*rentalCost;
    }

    @Override
    public double calculateLateFees(int lateDays) {
        return lateDays*lateFees;
    }
}

class Truck extends Vehicle {
    private final double rentalCost = 20.0;
    private final double lateFees = 30.0;
    public Truck(String vechileID, String model) {
        super(vechileID, model);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days*rentalCost;
    }

    @Override
    public double calculateLateFees(int lateDays) {
        return lateDays*lateFees;
    }
}
public class VehicleMain {
    public static void main(String[] args) {
        Vehicle car = new Car("Car", "Model");
        System.out.println("car "+car.calculateRentalCost(10));
        System.out.println("car "+car.calculateLateFees(10));
        Vehicle bike = new Bike("Bike", "Model");
        System.out.println("bike "+bike.calculateRentalCost(15));
        System.out.println("bike "+bike.calculateLateFees(15));
        Vehicle truck = new Truck("Truck", "Model");
        System.out.println("truck "+truck.calculateRentalCost(20));
        System.out.println("truck "+truck.calculateLateFees(20));
    }
}
