package filehandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderMain {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//            String letter = br.readLine();
            System.out.println(br.readLine());

//            while (br.ready()){
//                System.out.println(letter);
//                letter = br.readLine();
//            }

            br.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
