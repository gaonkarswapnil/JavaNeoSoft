package oops.polymorphism;

abstract class Product{
    private String productId, name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    abstract double calculateDiscountPrice();

    abstract void displayDetails();
}

class Electronic extends Product{

    public Electronic(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    double calculateDiscountPrice() {
        double discount = getPrice()*0.1;
        return getPrice()-discount;
    }

    @Override
    void displayDetails() {
        System.out.println("Product Name: " + getName()+" Product Price: " + getPrice()+" Discounted Price "+calculateDiscountPrice());
    }
}

class Clothing extends Product{

    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    double calculateDiscountPrice() {
        double discount = getPrice()*0.15;
        return getPrice()-discount;
    }

    @Override
    void displayDetails() {
        System.out.println("Product Name: " + getName()+" Product Price: " + getPrice()+" Discounted Price "+calculateDiscountPrice());
    }
}

class Groceries extends Product{

    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    double calculateDiscountPrice() {
        double discount = getPrice()*0.05;
        return getPrice()-discount;
    }

    @Override
    void displayDetails() {
        System.out.println("Product Name: " + getName()+" Product Price: " + getPrice()+" Discounted Price "+calculateDiscountPrice());
    }
}

public class ProductMain {
    public static void main(String[] args) {
        Product electronic = new Electronic("12345", "Mobile", 10.0);
        electronic.displayDetails();

        Product clothing = new Clothing("12345", "Shirt", 10.0);
        clothing.displayDetails();

        Product groceries = new Groceries("12345", "Vegetables", 10.0);
        groceries.displayDetails();
    }
}
