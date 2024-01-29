package de.telran.homeWorks.year2024.homeWork24_01_24;

import lombok.SneakyThrows;

import java.util.Scanner;

//1. Пользователь с клавиатуры вводит цифру. Вы создаете динамически нужное количество потоков равное введенной цифре,
//        нумеруете их и запускаете на выполнение. Каждый поток должен выводить свой номер на экран 100 раз с интервалом 100
//        миллисекунд перед каждым выводом. Сделайте так, чтобы главный поток выполнения программы не завершился до окончания
//        работы всех дочерних потоков.
public class Task_1 {
    @SneakyThrows
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввведите количество потоков ->");
        Thread threadMain = new Thread();
         int theardCount = scanner.nextInt()+1;
        threadMain.start();
        System.out.println("____ Главный поток стартовал ____");

        for (int i = 1; i < theardCount; i++) {
            Thread theard = new MakeTherads(i);

            try {
                theard.start();
                Thread.sleep(100);
                theard.join();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(theard.getName());
        }



   threadMain.join();
        System.out.println("____ Главный поток остановлен ____");
    }
}
class MakeTherads extends Thread{
    private int countTheard;

    public MakeTherads(int countTheard) {
        this.countTheard = countTheard;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Potok "+ countTheard+ " -> " + i);

        }
    }
}
