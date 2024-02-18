package de.telran.lessonsPlakuchiy.module_1.module_2.lesson3Iterrators;

import java.util.Iterator;
import java.util.List;

public class PracticaLesson3 {
    public static void main(String[] args) {

        long start = 10_000_000;
        int days = 10 * 365;

        for (int i = 1; i <= days ; i++) {
            start = start - 8 + 14; //8 животных умирает, 14 рождается
            if(i % 365 == 0)
            System.out.println("Сейчас в Лимпопо - "+start +" животных");

        }






}
}