package oops.inheritance;

abstract class FoodItem{
    private String itemID, name;
    private double cost;

    public FoodItem(String itemID, String name, double cost) {
        this.itemID = itemID;
        this.name = name;
        this.cost = cost;
    }

    public String getItemID() {
        return itemID;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public abstract String getPreparationTime();
}

class Appetizer extends FoodItem{

    public Appetizer(String itemID, String name, double cost) {
        super(itemID, name, cost);
    }

    @Override
    public String getPreparationTime() {
        return "10 minutes";
    }
}

class MainCourse extends FoodItem{

    public MainCourse(String itemID, String name, double cost) {
        super(itemID, name, cost);
    }

    @Override
    public String getPreparationTime() {
        return "25 minutes";
    }
}

class Dessert extends FoodItem{

    public Dessert(String itemID, String name, double cost) {
        super(itemID, name, cost);
    }

    @Override
    public String getPreparationTime() {
        return "15 minutes";
    }
}

public class RestaurantMain {
    public static void main(String[] args) {
        FoodItem appetizer = new Appetizer("123","Appetizer", 200);
        FoodItem mainCourse = new MainCourse("123","Main Course", 300);
        FoodItem dessert = new Dessert("456","Dessert", 400);

        System.out.println("Appetizer "+appetizer.getPreparationTime());
        System.out.println("Main Course "+mainCourse.getPreparationTime());
        System.out.println("Dessert "+dessert.getPreparationTime());
    }
}
