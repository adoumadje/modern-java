package dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

public class DateToLocalDate {
    public static void main(String[] args) {
        /**
         *  java.util.Date
         */
        Date date = new Date();
        System.out.println("java.util.Date: " + date);
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("localDate: " + localDate);
        Date date1 = Date.from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("date1: " + date1);

        /**
         *  java.sql.Date
         */
        java.sql.Date date2 = java.sql.Date.valueOf(localDate);
        System.out.println("java.sql.Date: " + date2);
        LocalDate localDate1 = date2.toLocalDate();
        System.out.println("localDate1: " + localDate1);
    }
}
