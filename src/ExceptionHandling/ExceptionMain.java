package ExceptionHandling;

public class ExceptionMain {
    public static void main(String[] args) {
        try {
            int arr[] = {1,2,3};
            System.out.println(arr[2]);
            int x  = 10/0;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("Array is smaller");
        }catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("Cannot divide by zero");
        }
    }
}
