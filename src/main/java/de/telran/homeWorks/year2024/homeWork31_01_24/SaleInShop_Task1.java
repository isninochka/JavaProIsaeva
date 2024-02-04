package de.telran.homeWorks.year2024.homeWork31_01_24;


import java.util.concurrent.Semaphore;

//У вас в магазине распродажа. К вам набежало 10 000 клиентов и вы пытаетесь корректно всех обслужить с учетом того,
//что одновременно у вас внутри магазина может находиться не более 10 покупателей(согласно карантинным нормам) и
// время обслуживания одного покупателя занимает 30 секунд. Сымитируйте данный процесс работы и
//подсчитайте за какой период времени вы сможете обслужить данный объем покупателей?
//Отдельный покупатель - отдельный поток. Какой синхронизатор с библиотеки concurrent Вы бы использовали?
public class SaleInShop_Task1 {
    public static void main(String[] args) {
        int maxBuers = 10_000;
        int maxInShop = 10;
        int id = 1;
      Semaphore shop = new Semaphore(1);


                System.out.println("Магазин открыт");


        System.out.println("Распродажа!!!");


        Semaphore semaphore = new Semaphore(maxInShop);
        Buyer by = new Buyer(id, semaphore,shop);
        Thread buyer = new Thread(by,"Buyer ");
        for (int i = 0; i < maxBuers; i++) {
            buyer.run();


        }


    }
}
class Buyer implements Runnable{
    private int id;
    private Semaphore semaphore;
    private Semaphore shop;


    public Buyer(int id, Semaphore semaphore, Semaphore shop) {
        this.id = id;
        this.semaphore = semaphore;
        this.shop = shop;
    }

    @Override
    public void run() {

        try {
            System.out.println("Покупатель " + id+
                    " ждет когда его пустят в магазин");

            semaphore.acquire();
            shop.release();


            System.out.println("Покупатель " + id+
                    " уже вовсю тратит деньги на распродаже!");

            Thread.sleep(1000);
            System.out.println("Покупатель " + id+" деньги закончились, иду домой");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
        id++;
        try {
            shop.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
