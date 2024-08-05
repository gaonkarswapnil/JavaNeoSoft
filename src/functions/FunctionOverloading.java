package functions;

public class FunctionOverloading {
    static void add(int a, int b){
        System.out.println("Int Addition: "+(a+b));
    }

    static void add(float a, float b){
        System.out.println("Float Addition: "+(a+b));
    }

    public static void main(String[] args) {
        add(23,43);
        add(23.5f, 42.5f);
    }
}
