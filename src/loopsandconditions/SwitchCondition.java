package loopsandconditions;

public class SwitchCondition {
    public static void main(String[] args) {
        String city = "Kalyan";
        switch (city) {
            case "Mumbai":
                System.out.println("You are in Mumbai");
                break;

            case "Thane":
                System.out.println("You are in Thane");
                break;

            case "Kalyan":
                System.out.println("You are in Kalyan");
                break;

            default:
                System.out.println("Unknown");
        }
    }
}
