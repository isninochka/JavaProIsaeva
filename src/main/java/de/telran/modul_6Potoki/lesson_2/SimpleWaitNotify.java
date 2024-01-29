package de.telran.modul_6Potoki.lesson_2;

public class SimpleWaitNotify {
    public static void main(String[] args) throws InterruptedException {
        MyThread th = new MyThread();
        th.start();
        MyThread1 th1 = new MyThread1();
        th1.start();


    }
}
class MyThread extends Thread{


    @Override
    public void run() {
        int i;
        try {
            for (i = 0; i < 10; i++) {

                System.out.println(Thread.currentThread().getName() + " going step ->" + i);
                Thread.sleep(1000);
                if (i==5)
                    wait();

            }

        } catch (InterruptedException e) {
            System.out.println("_______Exception_____"+Thread.interrupted());
            i=10;

        }
        System.out.println("Thread job is ended!");

    }


}

class MyThread1 extends Thread{

    @Override
    public void run() {
        int i;
        try {
            for (i = 0; i < 10; i++) {

                System.out.println(Thread.currentThread().getName() + " going step ->" + i);
                Thread.sleep(1000);
                notify();

            }

        } catch (InterruptedException e) {
            System.out.println("_______Exception_____"+Thread.interrupted());
            i=10;

        }
        System.out.println("Thread job is ended!");

    }


}
