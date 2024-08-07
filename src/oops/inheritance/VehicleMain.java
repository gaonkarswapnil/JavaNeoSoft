package oops.inheritance;

abstract class Vehicle {
    private String vehicleID, model;
    private double baseCost;

    public Vehicle(String vehicleID, String model, double baseCost) {
        this.vehicleID = vehicleID;
        this.model = model;
        this.baseCost = baseCost;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public String getModel() {
        return model;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public abstract double calculateProductionCost();

    public abstract String getAssemblyTime();
}

class Car extends Vehicle {
    private double additionalCost;

    public Car(String vehicleID, String model, double baseCost, double additionalCost) {
        super(vehicleID, model, baseCost);
        this.additionalCost = additionalCost;
    }

    @Override
    public double calculateProductionCost() {
        return getBaseCost()+additionalCost;
    }

    @Override
    public String getAssemblyTime() {
        return "5 Days";
    }
}

class Bike extends Vehicle{
    private double additionalCost;

    public Bike(String vehicleID, String model, double baseCost, double additionalCost) {
        super(vehicleID, model, baseCost);
        this.additionalCost = additionalCost;
    }

    @Override
    public double calculateProductionCost() {
        return getBaseCost()+additionalCost;
    }

    @Override
    public String getAssemblyTime() {
        return "2 days";
    }
}

class Truck extends Vehicle{
    private double additionalCost;

    public Truck(String vehicleID, String model, double baseCost, double additionalCost) {
        super(vehicleID, model, baseCost);
        this.additionalCost = additionalCost;
    }

    @Override
    public double calculateProductionCost() {
        return getBaseCost()+additionalCost;
    }

    @Override
    public String getAssemblyTime() {
        return "7 days";
    }
}

class VehicleMain{
    public static void main(String[] args) {
        Vehicle car = new Car("1","Car",8000, 500);
        Vehicle bike = new Bike("2","Bike",3000, 300);
        Vehicle truck = new Truck("3","Truck",10000, 1000);

        System.out.println("Vehicle: " + car.getClass().getSimpleName()+" production cost : "+car.calculateProductionCost()+" deliver at "+car.getAssemblyTime());
        System.out.println("Vehicle: " + bike.getClass().getSimpleName()+" production cost : "+bike.calculateProductionCost()+" deliver at "+bike.getAssemblyTime());
        System.out.println("Vehicle: " + truck.getClass().getSimpleName()+" production cost : "+truck.calculateProductionCost()+" deliver at "+truck.getAssemblyTime());

    }
}