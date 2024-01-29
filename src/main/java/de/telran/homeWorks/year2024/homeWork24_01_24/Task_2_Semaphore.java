package de.telran.homeWorks.year2024.homeWork24_01_24;

import lombok.SneakyThrows;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Task_2_Semaphore {
    @SneakyThrows
    public static void main(String[] args) {
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
        Semaphore tableSemaphore = new Semaphore(1);
        Semaphore partsSemaphore = new Semaphore(0);

        Thread robot1 = new Thread(new Robot1(tableSemaphore,partsSemaphore,quantityPats), "Robot1");
        Thread robot2 = new Thread(new Robot2(tableSemaphore,partsSemaphore,quantityPats), "Robot2");

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

class Robot1 implements Runnable{
    private final Semaphore tableSemaphore;
    private final Semaphore partsSemaphore;

    private final int partsQuantity;

    public Robot1(Semaphore tableSemaphore, Semaphore partsSemaphore, int partsQuantity) {
        this.tableSemaphore = tableSemaphore;
        this.partsSemaphore = partsSemaphore;
        this.partsQuantity = partsQuantity;
    }

    @Override
    public void run() {
        for (int i = 1; i < partsQuantity + 1; i++) {
            try {
                    tableSemaphore.acquire();
                    System.out.println(Thread.currentThread().getName()+" Беру деталь № " + i+" и несу на стол... ");
                    partsSemaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Robot2 implements Runnable{
    private final Semaphore tableSemaphore;
    private final Semaphore partsSemaphore;

    private final int partsQuantity;

    public Robot2(Semaphore tableSemaphore, Semaphore partsSemaphore, int partsQuantity) {
        this.tableSemaphore = tableSemaphore;
        this.partsSemaphore = partsSemaphore;
        this.partsQuantity = partsQuantity;
    }

    @Override
    public void run() {
        for (int j = 1; j < partsQuantity + 1; j++) {
            try {
                partsSemaphore.acquire();
                System.out.println(Thread.currentThread().getName()+" Забираю деталь № " + j+" и несу на обработку...");
                tableSemaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

