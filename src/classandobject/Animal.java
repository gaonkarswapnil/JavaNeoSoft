package classandobject;

public class Animal {
    String name, breed;

    void data(){
        System.out.println("Animal "+name+" "+breed);
    }

}

class AnimalMain{
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.name = "Dog";
        obj.breed = "Husky";
        obj.data();
    }
}