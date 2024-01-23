package de.telran.homeWorks.year2024.homeWork19_01_24;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
public class SimpleDates {
    public static void main(String[] args) {
        //1) реализовать метод, который принимает год и проверяет на высокосность
        isLeapYear();

        //2) вывести на консоль дату локализованную для Индии (например)
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("dd MMMM yyyy HH:mm")
                .withLocale(new Locale("hi","IN"));
        String hindiDate = now.format(formatter);
        System.out.println(hindiDate);

        //3) вывести дату в формате 19-12-22, 19, 353, 11:47 <дата, день месяца, день в году, время>
        LocalDateTime now1 = LocalDateTime.now();
        LocalDate date = now1.toLocalDate();
        LocalTime time = now1.toLocalTime();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yy");
        DateTimeFormatter dayFormater = DateTimeFormatter.ofPattern("D");
        String formatDate = date.format(formatter1);
        String dayOfMonth = String.valueOf(date.getDayOfMonth());
        String dayOfYear = date.format(dayFormater);
        String timeFormat = time.format(DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println("Дата - "+formatDate+" день месяца - "+dayOfMonth+" день в году - "+ dayOfYear +" время - "+timeFormat);

        //4) создать дату своего рождения, вывести на консоль в формате "10 Января 1985"
        LocalDate myBithDay = LocalDate.of(1985,9,19);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("d MMMM yyyy");
        System.out.println(myBithDay.format(formatter2));

        //5) проверить дата "10 Января 1985" - это пятница?
        System.out.println(isFriday("10 января 1985"));

        //6) вычесть 10 лет из созданной даты, вывести на консоль
        LocalDate sohnDay = LocalDate.of(2014,9,10);
        System.out.println(sohnDay.minusYears(10));

        // 7) получить объект Instant из "2022-12-19T06:55:30.00Z", вывести на консоль
        String text = "2022-12-19T06:55:30.00Z";
        ZonedDateTime zone = ZonedDateTime.parse(text);
        System.out.println(zone);

        //8) получить ZonedDateTime из "Pacific/Midway", вывести на консоль
        ZoneId zoneId = ZoneId.of("Pacific/Midway");
        zone = ZonedDateTime.now(zoneId);
        System.out.println(zone);






    }
    //1) реализовать метод, который принимает год и проверяет на высокосность
    private static void isLeapYear(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год, что-бы проверить на високосность -> ");
        int year = scanner.nextInt();
        boolean leapyear = (year > 1584 && ((year % 400== 0) || (year % 4 ==0 && year % 100!=0)));

        if(leapyear)
            System.out.println(year + " Високосный год");
        else System.out.println(year + " Не високосный год");
    }

    //        5) проверить дата "10 Января 1985" - это пятница?
    private static boolean isFriday(String date){
        LocalDate date1 = LocalDate.parse(date, DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("ru","RU")));
        return date1.getDayOfWeek() == DayOfWeek.FRIDAY;
    }




}
