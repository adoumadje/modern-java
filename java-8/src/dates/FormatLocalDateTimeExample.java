package dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatLocalDateTimeExample {
    public static void main(String[] args) {
        /**
         *  Parse LocalDateTime
         */
        String dateTime = "2025-07-03T14:16:18";
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
        System.out.println("localDateTime: " + localDateTime);
        LocalDateTime localDateTime1 = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("localDateTime1: " + localDateTime1);

        String dateTime1 = "2025.07.02T12*30*59";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd'T'HH*mm*ss");
        LocalDateTime localDateTime2 = LocalDateTime.parse(dateTime1, dateTimeFormatter);
        System.out.println("localDateTime2: " + localDateTime2);

        String dateTime2 = "2025.07.06abc14:54:38";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy.MM.dd'abc'HH:mm:ss");
        LocalDateTime localDateTime3 = LocalDateTime.parse(dateTime2, dateTimeFormatter1);
        System.out.println("localDateTime3: " + localDateTime3);


        /**
         *  Format LocalDateTime
         */
        LocalDateTime localDateTime4 = LocalDateTime.now();
        String formattedDateTime = localDateTime4.format(dateTimeFormatter1);
        System.out.println("formattedDateTime: " + formattedDateTime);
    }
}
