package dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDurationExample {
    public static void main(String[] args) {
        LocalTime localTime1 = LocalTime.of(18, 38,52, 455_478_454);
        LocalTime localTime2 = LocalTime.of(20, 14,48, 455_478_324);

        long hDiff = localTime1.until(localTime2, ChronoUnit.HOURS);
        System.out.println("hours diff: " + hDiff);

        Duration duration = Duration.between(localTime1, localTime2);
        System.out.println("toHours: " + duration.toHours());
        System.out.println("toMinutes: " + duration.toMinutes());

        Duration duration1 = Duration.ofMinutes(20);
        System.out.println("getSeconds: " + duration1.getSeconds());

        Duration duration2 = Duration.ofHours(30);
        System.out.println("toMinutes: " + duration2.toMinutes());

        /**
         *  LocalDateTime
         */
        LocalDateTime localDateTime1 = LocalDateTime.of(2024, 12, 25, 16, 42);
        LocalDateTime localDateTime2 = LocalDateTime.now();

        Duration duration3 = Duration.between(localDateTime1, localDateTime2);
        System.out.println("toDays: " + duration3.toDays());

        /**
         *  Not supported
         */

        LocalDate localDate1 = LocalDate.of(2016, 2, 19);
        LocalDate localDate2 = LocalDate.now();

//        Duration duration4 = Duration.between(localDate1, localDate2);
//
//        System.out.println("days: " + duration4.toDays());
    }
}
