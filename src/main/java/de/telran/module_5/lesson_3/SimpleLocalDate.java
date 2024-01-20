package de.telran.module_5.lesson_3;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SimpleLocalDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(date);
        System.out.println(dayOfWeek);
        System.out.printf("%d.%d.%d \n", dayOfMonth, month, year);

        date = LocalDate.of(1996, 1, 1);

        date = date.plusYears(4);
        date = date.plusMonths(3);
        date = date.plusDays(14);
        System.out.println(date);

        date = date.minusMonths(10);
        date = date.minusDays(3);
        System.out.println(date);
    }
}
