package oops.inheritance;

abstract class Person{
    private String personID, name;
    private int age;

    public Person(String personID, String name, int age) {
        this.personID = personID;
        this.name = name;
        this.age = age;
    }

    public String getPersonID() {
        return personID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String getRole();
}

class Students extends Person{

    public Students(String personID, String name, int age) {
        super(personID, name, age);
    }

    @Override
    public String getRole() {
        return "Student";
    }
}

class Professor extends Person{

    public Professor(String personID, String name, int age) {
        super(personID, name, age);
    }

    @Override
    public String getRole() {
        return "Professor";
    }
}

class Staff extends Person{

    public Staff(String personID, String name, int age) {
        super(personID, name, age);
    }

    @Override
    public String getRole() {
        return "Staff";
    }
}

public class UniversityMain {
    public static void main(String[] args) {
        Person student = new Students("1","Oliver",24);
        System.out.println(student.getRole());

        Person professor = new Professor("1","Oliver",25);
        System.out.println(professor.getRole());

        Person staff = new Students("1","Author",30);
        System.out.println(staff.getRole());
    }
}
