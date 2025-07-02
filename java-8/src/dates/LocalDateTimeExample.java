package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime0 = LocalDateTime.now();
        System.out.println(localDateTime0);
        LocalDateTime localDateTime1 = LocalDateTime.of(2023, 7, 18, 18, 42,
                14, 623_212_656);
        System.out.println(localDateTime1);
        LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(localDateTime2);

        /**
         *  getting value from LocalDateTime
         */
        System.out.println("getYear: " + localDateTime0.getYear());
        System.out.println("getHour: " + localDateTime0.getHour());
        System.out.println("get ChronoField.MINUTE_OF_DAY: " + localDateTime0.get(ChronoField.MINUTE_OF_DAY));

        /**
         *  modifying LocalDateTime
         */
        System.out.println("plusMonths: " + localDateTime0.plusMonths(7));
        System.out.println("minusHours: " + localDateTime0.minusHours(12));
        System.out.println("with ChronoField.DAY_OF_MONTH: " + localDateTime0.with(ChronoField.DAY_OF_MONTH, 13));

        /**
         *  Conversion
         */
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        LocalDateTime localDateTime = localDate.atTime(localTime);
        System.out.println(localDateTime);

        localDateTime = localTime.atDate(localDate);
        System.out.println(localDateTime);

        localDate = localDateTime.toLocalDate();
        System.out.println(localDate);
        localTime = localDateTime.toLocalTime();
        System.out.println(localTime);

    }
}
