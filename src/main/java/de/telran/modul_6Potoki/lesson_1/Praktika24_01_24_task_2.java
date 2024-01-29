package de.telran.modul_6Potoki.lesson_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//    Создайте класс SharedResourceRunner, который использует общий ресурс в виде списка строк.
//        Несколько потоков должны добавлять строки в этот список, а один контрольный поток должен завершать работу всех потоков,
//        когда в списке накопится достаточно строк(сами условия придумайте)

public class Praktika24_01_24_task_2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        Thread tr1 = new Thread(){
            @Override
            public void run() {

            }
        };
        Thread tr2 = new Thread(){
            @Override
            public void run() {

            }
        };

        Thread tr3 = new Thread(){
            @Override
            public void run() {

            }
        };

        Thread tr4 = new Thread(){
            @Override
            public void run() {

            }
        };
        tr1.start();
        tr2.start();
        tr3.start();
        tr4.start();

        try {
            String st1 = "Программист";
            stringList.add(st1);
            String st2 = "это человек";
            stringList.add(st2);
            String st3 = "преобразующий";
            stringList.add(st3);
            String st4 = "кофе в код";
            stringList.add(st4);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }


        System.out.println(stringList);

        String string = "Программист это человек, преобразующий кофе в код";

        if(stringList.size() == string.length()){
            try {
                tr1.join();
                tr2.join();
                tr3.join();
                tr4.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("OK");
        } else {
            System.out.println("error");
        }




    }
}
