package loopsandconditions;

public class BreakStatements {
    public static void main(String[] args) {
        int i=0;
        while (i<10){
            if(i == 5){
                System.out.println("i == "+i);
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
