package filehandling;

import java.io.*;

public class FileMain {
    public static void main(String[] args) {
        try{
            File f = new File("/home/neosoft/Desktop/Swapnil Gaonkar/Java/JavaPractice/src/filehandling/newText.txt");
            f.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("/home/neosoft/Desktop/Swapnil Gaonkar/Java/JavaPractice/src/filehandling/newText.txt"));
            bw.write("Hello World");
            bw.write(10);
            bw.newLine();
            bw.write(90);
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        try{
            BufferedReader br = new BufferedReader(new FileReader("/home/neosoft/Desktop/Swapnil Gaonkar/Java/JavaPractice/src/filehandling/newText.txt"));
            while (br.ready()){
                System.out.println(br.readLine());
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
