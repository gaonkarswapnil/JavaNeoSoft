package classandobject;

public class BasicConstructor {
    String name;
    int age;

    public BasicConstructor() {
        System.out.println("Default Constructor");
    }

    BasicConstructor(String name, int age) {
        System.out.println("name and age parameter in Constructor");
        this.name = name;
        this.age = age;
    }

    BasicConstructor(String name) {
        System.out.println("name parameter in Constructor");
        this.name = name;
        this.age = 24;
    }

    BasicConstructor(int age) {
        System.out.println("age parameter in Constructor");
        this.age = age;
        this.name = "Oliver";
    }

    void data() {
        System.out.println("Data " + name + " " + age);
    }
}

class BasicConstructorMain {
    public static void main(String[] args) {
        BasicConstructor obj = new BasicConstructor() ;
        obj.name = "Batman";
        obj.age = 30;
        obj.data();

        obj = new BasicConstructor("Swapnil", 24);
        obj.data();

        obj = new BasicConstructor(24);
        obj.data();

        obj = new BasicConstructor("Gaonkar");
        obj.data();
    }
}