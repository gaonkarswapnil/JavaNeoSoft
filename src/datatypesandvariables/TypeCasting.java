package datatypesandvariables;

public class TypeCasting {
    public static void main(String[] args) {
        long long1 = 9999999999999999L;
        System.out.println(long1);
        int int1 = (int)long1;
        System.out.println(int1);
        short short1 = (short) int1;
        System.out.println(short1);
        byte byte1 = (byte)short1;
        System.out.println(byte1);
    }
}
