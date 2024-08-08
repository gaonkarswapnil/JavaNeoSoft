package filehandling;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LoggingUser {
    private static final String LOG_FILE = "userAction.log";
    private static final String path = "/home/neosoft/Desktop/Swapnil Gaonkar/Java/JavaPractice/src/filehandling/"+LOG_FILE;

    public static void createLogFile() {
        try{
            File f = new File(path);
            f.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void writeLog(String action){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String timeStamp = now.format(formatter);

            bw.write(timeStamp+" "+ action);
            bw.newLine();

            bw.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void readLog(){
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            while(br.ready()){
                System.out.println(br.readLine());
            }
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        createLogFile();
        writeLog("Form Submitted");
        writeLog("Data deleted");
        writeLog("Login");
        readLog();
    }
}
