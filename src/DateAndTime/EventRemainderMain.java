package DateAndTime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EventRemainderMain {
    public static void main(String[] args) {

        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            String dateTime = reader.readLine();
            LocalDateTime dt = LocalDateTime.parse(dateTime, df);

            LocalDateTime now = LocalDateTime.now();
            System.out.println(now);

            if(dt.isAfter(now)){
                Duration duration = Duration.between(now,dt);
                long days = duration.toDays();
                long hours = duration.toHours()%24;
                long minutes = duration.toMinutes()%60;
//                long seconds = duration.getSeconds();
                System.out.println(days +" "+ hours +" "+ minutes );
            }

//            System.out.println(dt);

            reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
