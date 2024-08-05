package loopsandconditions;

public class IfElseifElseCondition {
    public static void main(String[] args) {
        String city = "Kalyan";

        if(city == "Mumbai") {
            System.out.println("You are in Mumbai");
        } else if (city == "Thane") {
            System.out.println("You are in Thane");
        } else {
            System.out.println("You are in "+city);
        }
    }
}
