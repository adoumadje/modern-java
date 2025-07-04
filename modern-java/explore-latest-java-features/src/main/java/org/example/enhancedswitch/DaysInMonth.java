package org.example.enhancedswitch;

import java.time.Month;
import java.time.Year;

public class DaysInMonth {
    public static int getDays(Month month, int year) {
        int numOfDays = 0;
        switch (month) {
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                numOfDays = 30;
                break;
            case FEBRUARY:
                numOfDays = Year.isLeap(year) ? 29 : 28;
                break;
            default:
                numOfDays = 31;
        }
        return numOfDays;
    }

    public static int getDaysV2(Month month, int year) {
        return switch (month) {
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
            case FEBRUARY -> Year.isLeap(year) ? 29 : 28;
            default -> 31;
        };
    }
}
