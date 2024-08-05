package loopsandconditions;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

//        foreach
        String[] arr = {"A","B","C","D","E","F"};
        for(String n: arr){
            System.out.println(n);
        }
    }
}
