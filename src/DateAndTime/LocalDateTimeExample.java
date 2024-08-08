package DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
    public static void main(String[] args) {
//        Current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime dateTime = LocalDateTime.of(2003,12,01,12,15);
        System.out.println(dateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a");
        System.out.println(now.format(formatter));
    }
}
