package de.telran.homeWorks.year2024.homeWork15_01_24;

import java.util.regex.Pattern;

public class EmailControl {
    public static void main(String[] args) {
        //  1. Написать регулярное выражение для проверки email (например my_25@domen-38.de).

        String regexEmail = "\\w{1,}[_.-]{1,}\\w{1,}[@]{1}\\w{1,}[_.-]{1,}\\w{1,}[.]{1}\\w{1,5}";
        String actualEmail ="my_25@domen-38.de";
        System.out.println(Pattern.matches(regexEmail, actualEmail));

//        Написать регулярное выражение для проверки корректности нового пароля, которые соответствует определенным критериям:
//        состоять минимум из 8 символов;
//        должен обязательно включать хотя бы одну маленькую букву;
//        должен обязательно включать хотя бы одну большую букву;
//        должен обязательно включать хотя бы одну цифру;
//        должен обязательно включать хотя бы один спецсимвол (пример: !@#$%^&*_+-=);

        String regexPassword = "(?=.*[!@#$%^&*_+-=])(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,}";
        String actualPassword = "Y$%12345678yxcv";
        System.out.println(Pattern.matches(regexPassword, actualPassword));


    }
}
