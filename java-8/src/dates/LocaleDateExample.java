package dates;

import java.time.LocalDate;
import java.time.temporal.*;

public class LocaleDateExample {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate1);
        LocalDate localDate2 = LocalDate.of(2022, 3, 12);
        System.out.println(localDate2);
        LocalDate localDate3 = LocalDate.ofYearDay(2018, 165);
        System.out.println(localDate3);

        /**
         *  Getting values from LocalDate
         */

        System.out.println("getMonth:" + localDate1.getMonth());
        System.out.println("getMonthValue:" + localDate1.getMonthValue());
        System.out.println("getDayOfYear:" + localDate1.getDayOfYear());
        System.out.println("getEra:" + localDate1.getEra());
        System.out.println("get:" + localDate1.get(ChronoField.DAY_OF_MONTH));

        /**
         *  Modifying LocalDate
         */
        System.out.println("plusMonth: " + localDate1.plusMonths(2));
        System.out.println("plusYears: " + localDate1.plusYears(2));
        System.out.println("plusWeeks: " + localDate1.plusWeeks(2));
        System.out.println("minusDays: " + localDate1.minusDays(10));
        System.out.println("minus: " + localDate1.minus(2, ChronoUnit.DAYS));
        System.out.println("withYear: " + localDate1.withYear(2004));
        System.out.println("with TemporalAdjusters: " + localDate1.with(TemporalAdjusters.firstDayOfYear()));
        System.out.println("with TemporalAdjusters: " + localDate1.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println("with ChronoField: " + localDate1.with(ChronoField.YEAR, 2019));


        /**
         *  additional methods
         */
        System.out.println("siLeapYear: " + localDate1.isLeapYear());
        System.out.println("isEqual: " + localDate2.isEqual(localDate3));
        System.out.println("isBefore: " + localDate2.isBefore(localDate3));
        System.out.println("isAfter: " + localDate2.isAfter(localDate3));

        /**
         *  Unsuppoorted
         */
//        System.out.println("minus: " + localDate1.minus(1, ChronoUnit.HOURS));
        System.out.println("isSupported: " + localDate1.isSupported(ChronoUnit.HOURS));
    }
}
