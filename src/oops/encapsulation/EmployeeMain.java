package oops.encapsulation;

class Employee{
    private String name;
    private int employeeID;
    private double hourlyRate, hoursWorked;

    public Employee(String name, int employeeID, double hourlyRate) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = 0;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void logHours(double hours){
        if(hours >= 0){
            hoursWorked += hours;
        }else{
            System.out.println("Enter positive number");
        }
    }

    public double calculateSalary(){
        return hoursWorked * hourlyRate;
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Oliver",12,250);
        employee.logHours(5);
        employee.logHours(5);
        System.out.println(employee.calculateSalary());

        Employee employee1 = new Employee("data",2,10);
        employee1.logHours(5);
        employee1.logHours(5);
        System.out.println(employee1.calculateSalary());
    }
}
