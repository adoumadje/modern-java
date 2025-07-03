package dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatLocalDateExample {
    public static void main(String[] args) {
        /**
         *  Parse Date
         */
        String date = "2025-07-03";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println("localDate: " + localDate);
        LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("localDate1: " + localDate1);

        String date2 = "20250307";
        LocalDate localDate2 = LocalDate.parse(date2, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("localDate2: " + localDate2);

        String date3 = "2025|03|07";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate3 = LocalDate.parse(date3, dateTimeFormatter);
        System.out.println("localDate3: " + localDate3);

        /**
         *  Format Date
         */

        LocalDate localDate4 = LocalDate.now();
        String formattedDate = localDate4.format(dateTimeFormatter);
        System.out.println("formattedDate: " + formattedDate);
    }
}
