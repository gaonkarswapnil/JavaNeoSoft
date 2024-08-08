package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterWriteFile {
    public static void main(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("/home/neosoft/Desktop/Swapnil Gaonkar/Java/JavaPractice/src/filehandling/note", true));

            bw.write("Hello World");
            bw.newLine();
            bw.write(10);
            bw.write(90);

            bw.write("👍");
            bw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
