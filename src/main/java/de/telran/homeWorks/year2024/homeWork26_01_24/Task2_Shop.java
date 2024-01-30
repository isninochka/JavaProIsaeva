package de.telran.homeWorks.year2024.homeWork26_01_24;
import java.util.Scanner;

//Есть Магазин, на котором может одновременно разместиться ограниченное количество товара (для примера
//можно взять 3 единицы, а лучше попросить пользователя ввести количество).
//За один раз Поставщик может привезти 1 шт. товара.
//Покупатель тоже может приобрести только 1 шт. товара.
//Напишите программу, которая позволит Покупателям приобретать товар и нужно сделать так,
//чтобы полки магазина не пустовали ;)
//Используйте wait / notify механизм многопоточности. Поставщик и Покупатель/ли - это разные потоки.
public class Task2_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество товара, которое всегда должно оставаться на полках магазина ->");
        int quantity = scanner.nextInt();
        Store store = new Store(quantity);

        Thread shop = new Thread();
        System.out.println("*****Магазин открыт и начинает свою работу*****");
        shop.start();

        Supplier sup = new Supplier(store);
        Buyer b = new Buyer(store);
        Thread supplier = new Thread(sup,"***Поставщик 1");
        Thread buyer = new Thread(b,"---Покупатель 1");
        Thread supplier2 = new Thread(sup,"***Поставщик 2");
        Thread buyer2 = new Thread(b,"---Покупатель 2");
        Thread buyer3 = new Thread(b,"---Покупатель 3");
        supplier.start();
        buyer.start();
        supplier2.start();
        buyer2.start();
        buyer3.start();

// программа не зацикливается, вроде все работает, но до закрытия магазина так и не доходит.

        try {
            supplier2.join();
            buyer2.join();
            buyer3.join();
            supplier.join();
            buyer.join();
            shop.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("*****Магазин закрыт*****");


    }
}
class Store{

    private int quantity;
    private int products =0;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Store(int quantity) {
        this.quantity = quantity;
    }

    public  synchronized void delivery(){

            while (products > quantity) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            products++;
            System.out.println(Thread.currentThread().getName() +" доставил товар в магазин");
            System.out.println(" Оставшееся количество товаров ->" + products);
            notify();

    }
    public synchronized void buy(){

            while (products <= quantity) {
                try {
                    wait();

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            products--;
            System.out.println(Thread.currentThread().getName()+" купил товар в магазине");
            System.out.println(" Оставшееся количество товаров ->" + products);
            notify();

    }


}
class Supplier implements Runnable{
    private Store store;

    public Supplier(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true){
            store.delivery();
        }
    }
}
class Buyer implements Runnable{
    private Store store;


    public Buyer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true){
            store.buy();
        }
    }
}

