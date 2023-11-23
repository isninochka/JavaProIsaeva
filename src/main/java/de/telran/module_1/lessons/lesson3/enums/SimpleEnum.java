package de.telran.module_1.lessons.lesson3.enums;

import java.time.DayOfWeek;

public class SimpleEnum {
    public static void main(String[] args) {

        SchoolerShedule schoolerShedule = null;
        if (schoolerShedule.getDayOfWeek() == DayOfWeekEnum.SUNDAY) {
            System.out.println("Ура, выходной. Можно поспать.");
        } else {
            System.out.println("Иди в школу");
        }
    }
}
