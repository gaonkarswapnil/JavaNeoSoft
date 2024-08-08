package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("/home/neosoft/Desktop/Swapnil Gaonkar/Java/JavaPractice/src/filehandling/note", true);
            fw.append("Hola Amigo");
            fw.write("Hello World");
            fw.write(1312);

            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
