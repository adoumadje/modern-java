package dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatLocalTimeExample {
    public static void main(String[] args) {
        /**
         *  Parse Time
         */
        String time = "13:25";
        LocalTime localTime = LocalTime.parse(time);
        System.out.println("localTime: " + localTime);
        LocalTime localTime1 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println("localTime1: " + localTime1);

        String time2 = "14*47*38";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm*ss");
        LocalTime localTime2 = LocalTime.parse(time2, dateTimeFormatter);
        System.out.println("localTime2: " + localTime2);

        /**
         *  Format Time
         */
        LocalTime localTime3 = LocalTime.now();
        String formattedTime = localTime3.format(dateTimeFormatter);
        System.out.println("formattedTime: " + formattedTime);
    }
}
