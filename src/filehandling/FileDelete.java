package filehandling;

import java.io.File;
import java.io.IOException;

public class FileDelete {
    public static void main(String[] args) {
        final String path = "/home/neosoft/Desktop/Swapnil Gaonkar/Java/JavaPractice/src/filehandling/temp.csv";
        try{
            File f = new File(path);
            if(f.exists()){
                f.delete();
            }else {
                f.createNewFile();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
