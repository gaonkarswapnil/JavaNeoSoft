package oops.inheritance;

abstract class Employee {
    private String employeeID, name;
    private int baseSalary;

    public Employee(String employeeID, String name, int baseSalary) {
        this.employeeID = employeeID;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private double benefits;

    public FullTimeEmployee(String employeeID, String name, int baseSalary, double benefits) {
        super(employeeID, name, baseSalary);
        this.benefits = benefits;
    }

    public double getBenefits() {
        return benefits;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary()+benefits;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;

    public PartTimeEmployee(String employeeID, String name, int baseSalary, double hourlyRate) {
        super(employeeID, name, baseSalary);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary()*hourlyRate;
    }
}

class Contractor extends Employee {
    private double contractAmount;

    public Contractor(String employeeID, String name, int baseSalary, double contractAmount) {
        super(employeeID, name, baseSalary);
        this.contractAmount = contractAmount;
    }

    public double getContractAmount() {
        return contractAmount;
    }

    @Override
    public double calculateSalary() {
        return getContractAmount();
    }
}
class EmployeeMain{
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("12","Swapnil",2000,2000);
        System.out.println(fullTimeEmployee.calculateSalary());

        Employee partTimeEmployee = new PartTimeEmployee("12","Swapnil",2000,2000);
        System.out.println(partTimeEmployee.calculateSalary());

        Employee contractor = new Contractor("12","Swapnil",2000,2000);
        System.out.println(contractor.calculateSalary());
    }
}
