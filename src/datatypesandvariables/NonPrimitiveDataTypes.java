package datatypesandvariables;

import java.lang.reflect.Array;

public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str);

        int[] arr = {12,13,14,15,16};
        System.out.println(arr.length);
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
