package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterMain {
    public static void main(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            bw.write("Hello World");
            bw.write(10);
            bw.newLine();
            bw.write(99);

            char[] arr = "Hello World".toCharArray();
            bw.write(arr);

            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
