package loopsandconditions;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even");
                continue;
            }
            System.out.println(i);
        }
    }
}
