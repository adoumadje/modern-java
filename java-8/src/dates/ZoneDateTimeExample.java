package dates;

import java.time.*;

public class ZoneDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime: " + zonedDateTime);
        System.out.println("getOffset: " + zonedDateTime.getOffset());
        System.out.println("getZone: " + zonedDateTime.getZone());
        System.out.println("Num of zones: " + ZoneId.getAvailableZoneIds().size());

        ZoneId.getAvailableZoneIds().stream()
                .filter(zone -> zone.startsWith("Africa"))
                .limit(5)
                .forEach(System.out::println);

        System.out.println("Nairobi: " + ZonedDateTime.now(ZoneId.of("Africa/Nairobi")));
        System.out.println("Kigali: " + ZonedDateTime.now(ZoneId.of("Africa/Kigali")));
        System.out.println("Cairo: " + ZonedDateTime.now(ZoneId.of("Africa/Cairo")));

        System.out.println("Using my clock: " + ZonedDateTime.now(Clock.systemDefaultZone()));
        System.out.println("Using Nairobi clock: " + ZonedDateTime.now(Clock
                .system(ZoneId.of("Africa/Nairobi"))));

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Africa/Nairobi"));
        System.out.println("localDateTime using zone Nairobi: " + localDateTime);
        LocalDateTime localDateTime1 = LocalDateTime.now(Clock.systemDefaultZone());
        System.out.println("localDateTime using clock default: " + localDateTime1);
        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("Africa/Mbabane"));
        System.out.println("ofInstant: " + localDateTime2);

        /**
         *  Conversion
         */
        LocalDateTime localDateTime3 = LocalDateTime.now();
        System.out.println("localDateTime3: " + localDateTime3);
        ZonedDateTime zonedDateTime1 = localDateTime3.atZone(ZoneId.of("Africa/Tunis"));
        System.out.println("from LocalDateTime: " + zonedDateTime1);
        ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.systemDefault());
        System.out.println("from Instant: " + zonedDateTime2);

        OffsetDateTime offsetDateTime = localDateTime3.atOffset(ZoneOffset.ofHours(6));
        System.out.println("offsetDateTime: " + offsetDateTime);
    }
}
