package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Date: " + localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println("Time: " + localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Date and Time: " + localDateTime);
    }
}
