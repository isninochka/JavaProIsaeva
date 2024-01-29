package de.telran.homeWorks.year2024.homeWork24_01_24;

import java.util.Scanner;


//        У вас есть стол, на который один робот-манипулятор кладет деталь, а второй забирает эту деталь.
//        Когда Робот1 положит деталь на стол, он должен обязательно ждать, пока Робот2 заберет эту деталь
//        и только тогда положить следующую. Постройте программу, которая автоматизирует эту работу.
//        Количество деталей, которые должны обработать манипуляторы, пользователь задает с клавиатуры.
public class task_2 {
    public static void main(String[] args) throws InterruptedException {


        Thread factory = new Thread() {
            @Override
            public void run() {
                System.out.println("---Рабочий день на фабрике начался---");
            }
        };
        factory.start();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество деталей, которые нужно обработать ->");
        int quantityPats = scanner.nextInt();
        Table table = new Table();
        Thread robot1 = new Robot1(quantityPats, table);
        Thread robot2 = new Robot2(quantityPats, table);
        robot1.start();
        robot2.start();

        try {
            robot1.join();
            robot2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        factory.join();
        System.out.println("---Рабочий день на фабрике закончился---");


    }

}

class Table {
    Object table = new Object();
    private boolean isPatsOnTable = false;

    public Table() {
        this.table = table;
    }

    public synchronized void putPats() {


        while (isPatsOnTable) {

            try {
                wait();
                System.out.println("и несу на стол... ");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        isPatsOnTable = true;
        notify();


    }

    public synchronized void takePats() {

        while (!isPatsOnTable) {
            try {
                System.out.println("и несу на обработку...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        isPatsOnTable = false;
        notify();


    }
}

class Robot1 extends Thread {
    private final int quantityPats;

    Table table;

    public Robot1(int quantityPats, Table table) {
        this.quantityPats = quantityPats;
        this.table = table;
    }


    @Override
    public void run() {
        for (int i = 1; i < quantityPats + 1; i++) {
            System.out.println("Беру деталь № " + i);
            table.putPats();

        }
    }
}

class Robot2 extends Thread {
    Table table;
    private final int quantityPats;

    public Robot2(int quantityPats, Table table) {
        this.quantityPats = quantityPats;
        this.table = table;
    }

    @Override
    public void run() {
        for (int j = 1; j < quantityPats + 1; j++) {

            System.out.println("Забираю деталь № " + j);
            table.takePats();

        }
    }
}



