package dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalTime localTime1 = LocalTime.of(12, 47);
        System.out.println(localTime1);
        LocalTime localTime2 = LocalTime.of(15, 37, 52);
        System.out.println(localTime2);
        LocalTime localTime3 = LocalTime.of(9, 20, 38, 958_123_005);
        System.out.println(localTime3);

        /**
         *  getting values from LocalTime
         */
        System.out.println("getHour: " + localTime.getHour());
        System.out.println("getMinute: " + localTime.getMinute());
        System.out.println("getSecond: " + localTime.getSecond());
        System.out.println("getNano: " + localTime.getNano());
        System.out.println("getLong ChronoField.CLOCK_HOUR_OF_DAY: "
                + localTime.getLong(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println("getLong ChronoField.HOUR_OF_DAY: " + localTime.get(ChronoField.HOUR_OF_DAY));

        /**
         *  Modifying LocalTime
         */

        System.out.println("plusHours: " + localTime.plusHours(2));
        System.out.println("plusMinutes: " + localTime.plusMinutes(20));
        System.out.println("plus ChronoUnit.HOURS: " + localTime.plus(3, ChronoUnit.HOURS));
        System.out.println("minus ChronoUnit.MINUTES: " + localTime.minus(120, ChronoUnit.MINUTES));
        System.out.println("withHour: " + localTime.withHour(13));
        System.out.println("withMinute: " + localTime.withMinute(56));
        System.out.println("with ChronoField.HOUR_OF_DAY: " + localTime.with(ChronoField.HOUR_OF_DAY, 15));


    }
}
