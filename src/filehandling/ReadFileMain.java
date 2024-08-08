package filehandling;

import java.io.FileReader;

public class ReadFileMain {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("/home/neosoft/Desktop/Swapnil Gaonkar/Java/JavaPractice/src/filehandling/note");
            int letters = fr.read();

            while(fr.ready()){
                System.out.println((char) letters);
                letters = fr.read();
            }

//            fr.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
