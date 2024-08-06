package oops.abstraction;

/*
Define an abstract class Employee with abstract methods work() and takeBreak().
Define an interface Reportable with a method submitReport().
Create subclasses Manager and Developer that extend Employee and implement Reportable.
Write a main class to create objects of Manager and Developer, and demonstrate calling their methods.
*/

abstract class Employee{
    abstract void work();
    abstract void takeBreak();
}

interface Reportable{
    void submitReport();
}

class Manager extends Employee implements Reportable{

    @Override
    void work() {
        System.out.println("Manager work");
    }

    @Override
    void takeBreak() {
        System.out.println("Manager takeBreak");
    }

    @Override
    public void submitReport() {
        System.out.println("Manager submitReport");
    }
}

class Developer extends Employee implements Reportable{

    @Override
    void work() {
        System.out.println("Developer work");
    }

    @Override
    void takeBreak() {
        System.out.println("Developer takeBreak");
    }

    @Override
    public void submitReport() {
        System.out.println("Developer submitReport");
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.work();
        manager.takeBreak();
        manager.submitReport();

        Developer developer = new Developer();
        developer.work();
        developer.takeBreak();
        developer.submitReport();
    }
}
