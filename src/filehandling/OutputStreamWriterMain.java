package filehandling;

import java.io.OutputStreamWriter;

public class OutputStreamWriterMain {
    public static void main(String[] args) {
        try{
            OutputStreamWriter osr = new OutputStreamWriter(System.out);
            osr.write("Hello World");

            osr.write(99);
            osr.write(10);
            osr.write('A');
            osr.write('\n');

            char[] arr = "Hello World".toCharArray();
            osr.write(arr);
            osr.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
