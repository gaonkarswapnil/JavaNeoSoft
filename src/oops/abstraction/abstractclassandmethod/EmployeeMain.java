package oops.abstraction.abstractclassandmethod;

/*
Define an abstract class Employee with a constructor that takes name and salary as parameters.
Create two subclasses Manager and Developer that extend Employee.
Add a method displayDetails() in the abstract class to print the name and salary.
Write a main class to create objects of Manager and Developer and display their details.
*/

abstract class Employee{
    protected String name;
    protected int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void displayDetails();
}

class Manager extends Employee{

    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    void displayDetails() {
        System.out.println("Name: "+name+ " Salary: "+salary);
    }
}

class Developer extends Employee{

    public Developer(String name, int salary) {
        super(name, salary);
    }

    @Override
    void displayDetails() {
        System.out.println("Name: "+name+ " Salary: "+salary);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee manager = new Manager("Manager", 500);
        manager.displayDetails();

        Employee developer = new Developer("Developer", 100);
        developer.displayDetails();
    }
}
