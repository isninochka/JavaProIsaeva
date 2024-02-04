package de.telran.homeWorks.year2024.homeWork31_01_24;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Кассир в магазине. К нему подходят клиенты с товаром отдают ему деньги и получают сдачу.
//По окончанию работы кассир подсчитывает сумму в кассе и сдает выручку.
//Кассир и каждый покупатель - это отдельные потоки. Сымитируйте данный процесс работы.
// Сумма оплаты и сумма сдачи может быть сгенерирована случайным образом.
//Какой синхронизатор с библиотеки concurrent Вы бы использовали для данного процесса?
public class Cashier_Task2 {
    public static void main(String[] args) {
        int buersCouner = 50;
        int id =1;
        Lock lock = new ReentrantLock();
        Buyer_Task2 b = new Buyer_Task2(id,lock);
        Thread buyer = new Thread(b);

        for (int i = 0; i < buersCouner; i++) {

            buyer.run();
        }





    }
}
class Buyer_Task2 implements Runnable{
    private int id;
    private Lock lock;



    public Buyer_Task2(int id, Lock lock) {
        this.id = id;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 1; i < 50; i++) {
            Random random = new Random();
            double payment = random.nextDouble(50)*100;
            double paid = random.nextDouble()*payment;
            double change = paid-payment;
            double sum = payment-change;

        lock.lock();

        System.out.println("Покупатель "+i+" оплатил-> "+paid+" всего -> "+payment);
        System.out.println("Покупатель "+i+" получил сдачу -> "+change);
        System.out.println("Итого в кассе -> "+sum);




}

    }
}
