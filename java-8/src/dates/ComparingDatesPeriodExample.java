package dates;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(2023, 7, 18);
        LocalDate localDate2 = LocalDate.of(2024, 11, 16);

        /**
         *  Compare
         */
        Period period = localDate1.until(localDate2);
        System.out.println("getYears: " + period.getYears());
        System.out.println("getMonths: " + period.getMonths());
        System.out.println("getDays: " + period.getDays());

        Period period1 = Period.ofYears(10);
        System.out.println("toTotalMonths: " + period1.toTotalMonths());
        System.out.println("getDays: " + period1.getDays());
        System.out.println("getMonths: " + period1.getMonths());

        Period period2 = Period.ofDays(52);
        System.out.println("getMonths: " + period2.getMonths());

        Period period3 = Period.between(localDate1, localDate2);
        System.out.println("getYears: " + period3.getYears());
        System.out.println("getMonths: " + period3.getMonths());
        System.out.println("getDays: " + period3.getDays());
    }
}
