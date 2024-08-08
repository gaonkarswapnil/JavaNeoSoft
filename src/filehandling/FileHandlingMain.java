package filehandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FileHandlingMain {
    public static void main(String[] args) {
//        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            System.out.println("Enter some letters");
            int letters = isr.read();

            while (isr.ready()) {
                System.out.println((char)letters);
                letters = isr.read();
            }
            isr.close();
        }catch (Exception e){
            e.printStackTrace();
        }



//        reader.close();
    }
}
