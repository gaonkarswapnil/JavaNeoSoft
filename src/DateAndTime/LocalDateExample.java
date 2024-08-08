package DateAndTime;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
//        Current data
        LocalDate today = LocalDate.now();
        System.out.println(today);

//        Specific date
        LocalDate date1 = LocalDate.of(1999, 12,01);
        System.out.println(date1);

//        parse => take date in String and convert it into LocalDate object it required date in proper date formate
        System.out.println(LocalDate.parse("2003-08-09"));
    }
}
