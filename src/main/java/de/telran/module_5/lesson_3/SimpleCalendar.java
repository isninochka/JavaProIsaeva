package de.telran.module_5.lesson_3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class SimpleCalendar {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar);
        Calendar calendar1 = Calendar.getInstance();
        System.out.println(calendar1);
        Calendar calendar2 = new GregorianCalendar(2022,Calendar.SEPTEMBER,19);
        System.out.println(calendar2.get(Calendar.MONTH));
        calendar2.set(Calendar.MINUTE, 90);
       calendar2.add(Calendar.MONTH, 2);
        System.out.println(calendar2.get(Calendar.MONTH));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss.SSSS");
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);
        simpleDateFormat = new SimpleDateFormat("dd MMM yyyy");
        String date1= simpleDateFormat.format(calendar.getTime());
        System.out.println(date1);


    }
}
