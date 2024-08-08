package DateAndTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExample {
    public static void main(String[] args) {
//        now() => will give us the current time
        LocalTime now = LocalTime.now();
        System.out.println(now);

//        For specific time
        LocalTime time1 = LocalTime.of(23,34,54);
        System.out.println(time1);

        System.out.println(LocalTime.parse("13:32:12"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ss:mm:HH");
        System.out.println(now.format(formatter));
    }
}
