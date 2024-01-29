package de.telran.homeWorks.year2024.homeWork24_01_24;

import java.util.Scanner;

//        У вас есть стол, на который один робот-манипулятор кладет деталь, а второй забирает эту деталь.
//        Когда Робот1 положит деталь на стол, он должен обязательно ждать, пока Робот2 заберет эту деталь
//        и только тогда положить следующую. Постройте программу, которая автоматизирует эту работу.
//        Количество деталей, которые должны обработать манипуляторы, пользователь задает с клавиатуры.
public class Task_2 {
    public static void main(String[] args) throws InterruptedException {

        // не получается потоки запустить поочередно
        Thread factory = new Thread() {
            @Override
            public void run() {
                System.out.println("---Рабочий день на фабрике начался---");
            }
        };
        factory.start();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество деталей, которые нужно обработать ->");
        int quantityParts = scanner.nextInt();
        Table table = new Table();

        Thread robot1 = new Thread(() ->{
                for (int i = 1; i < quantityParts + 1; i++) {
                    System.out.println("Беру деталь № " + i);
                    table.putPats();
                }
        });
        Thread robot2 = new Thread(() ->{
            for (int j = 1; j < quantityParts + 1; j++) {
                System.out.println("Забираю деталь № " + j);
                table.takePats();
            }
        });
        robot1.start();
        robot2.start();
        try {
            robot1.join();
            robot2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        factory.join();
        System.out.println("---Рабочий день на фабрике закончился---");


    }
}

class Table {
     private static final Object LOCK = new Object();

   public void putPats() {
        synchronized (LOCK) {
            System.out.println(" и несу на стол... ");

        }
    }

    public void takePats() {
       synchronized (LOCK){
           System.out.println(" и несу на обработку...");
       }
    }
}


