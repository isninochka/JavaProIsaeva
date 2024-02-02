package de.telran.homeWorks.year2024.homeWork29_01_24;

import java.util.concurrent.atomic.AtomicInteger;

//Одна компания решила заработать миллион. Для этого они решили создать курсы,
// где за 1000 можно обучиться чему-то очень интересному и полезному:
//они наняли преподавателей, которые получают 10% от суммы оплаты каждого студента.
//Напишите программу, которая даст возможность набирать студентов на курс
//до тех пор, пока компания не заработает миллион:) Используйте AtomicInteger для накопления.
public class OnlineSchool_Task2 {
    public static void main(String[] args) {
        int price = 1000;
        int clearPrice = price - (price*10/100); //цена минус 10% учителям
        int finalSum = 1_000_000;
        int counter = 0;

        AtomicInteger atomic = new AtomicInteger(0);

        while (atomic.get() < finalSum){
            Student student = new Student();
            student.run();
            atomic.addAndGet(clearPrice);
            counter++;

            System.out.println("Студет -> "+ counter+" закончил обучение");

        }

        System.out.println("Ваша цель в миллион - достигнута!");


    }
}

class Student implements Runnable {
    int counter;
    @Override
    public void run() {
        System.out.println("*** Студент учиться чему-то очень полезному и интересному ***");
    }
}
