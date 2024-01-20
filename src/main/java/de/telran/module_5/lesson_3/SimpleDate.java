package de.telran.module_5.lesson_3;

import java.util.Date;

public class SimpleDate {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);
        Date date2 = new Date(1212457978641L);
        System.out.println(date2);
//        Date date3 = new Date(124,0,19);
//        System.out.println(date3);

        boolean fl = date1.after(date2);
        System.out.println(fl);

        fl = date1.before(date2);
        System.out.println(fl);

        int compare = date1.compareTo(date2);
        System.out.println(compare);


    }
}
