package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderReadFile {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("/home/neosoft/Desktop/Swapnil Gaonkar/Java/JavaPractice/src/filehandling/note"));
            while (br.ready()){
                System.out.println(br.readLine());
            }
            br.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
