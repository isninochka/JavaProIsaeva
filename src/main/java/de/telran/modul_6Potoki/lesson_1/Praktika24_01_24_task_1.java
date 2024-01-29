package de.telran.modul_6Potoki.lesson_1;

import java.util.ArrayList;
import java.util.List;

public class Praktika24_01_24_task_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        List<Integer> intList = new ArrayList<>();
        Thread tr1 = new Thread(){
            @Override
            public void run() {
                int sum1 = 0;
                for (int i = 0; i < arr.length/2; i++) {
                    sum1 +=arr[i];

                }
                intList.add(sum1);
                System.out.println("1 Potok -> "+ sum1);
            }
        };



        Thread tr2 = new Thread(){
            @Override
            public void run() {
                int sum2 = 0;
                for (int i = arr.length/2; i < arr.length; i++) {
                    sum2 +=arr[i];

                }
                System.out.println("2 Potok -> "+ sum2);
                intList.add(sum2);
            }
        };
        tr1.start();
        tr2.start();


        try {
            tr1.join();
            tr2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int sum = 0;
        for (int el:intList) {
            sum +=el;


        }
        System.out.println(sum);

    }
}

