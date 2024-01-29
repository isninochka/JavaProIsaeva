package de.telran.modul_6Potoki.lesson_1;

public class SimpleMulti {

    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("1 Potok -> "+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        };
        MyTherad therad2 = new MyTherad();
        therad2.start();

        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Glavniy potok "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        try {
            thread.join();
            therad2.join();

            System.out.println("Finish");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}

class MyTherad extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("2 Potok -> "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

class MyThredRun implements Runnable{
    private int numThread;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("3 RUNPotok -> "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
