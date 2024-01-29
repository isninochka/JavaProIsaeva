package de.telran.modul_6Potoki.lesson_2;

import java.util.ArrayList;
import java.util.List;

public class SimpleDaemon {
    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(()->{
                for (int j = 0; j < 10 ; j++) {
                    System.out.println(Thread.currentThread().getName()+ " going step ->"+j);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            thread.setDaemon(true);
            threads.add(thread);
            thread.start();

        }
//        for (Thread th:threads) {
//            th.join();
//
//        }
        Thread.sleep(500);
        System.out.println("_______Program ended______");
    }
}

