package de.telran.modul_6Potoki.lesson_2;

public class SimpleDeleteThread {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            int j;
            try {
                for ( j = 0; j < 10; j++) {
                    System.out.println(Thread.currentThread().getName() + " going step ->" + j);
                    System.out.println(Thread.currentThread().getName());
                    System.out.println(Thread.currentThread().isInterrupted());
                    System.out.println(Thread.interrupted());}

                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Exception");
                        j=10;

                    }


        });
        Thread thread1 = new Thread(() -> {
           boolean isInterrapted = false;
           int j =0;
            try {
                while (!isInterrapted && j<10){
                    System.out.println(Thread.currentThread().getName() + " going step ->" + j);
                    System.out.println(Thread.currentThread().getName());
                    System.out.println(Thread.currentThread().isInterrupted());
                    System.out.println(Thread.interrupted());
                    j++;
                }

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("_______Exception_____"+Thread.interrupted());
                isInterrapted = true;

            }


        });


        thread.start();
        thread1.start();

        Thread.sleep(3000);
        thread1.interrupt();
        Thread.sleep(4000);
        thread.interrupt();

        System.out.println("_______Program ended______"+thread.isInterrupted());

    }
}


