package de.telran.homeWorks.year2024.homeWork31_01_24;

import java.util.concurrent.CountDownLatch;

//Вы едете на экскурсии. Каждый человек, при входе в автобус, называет свою фамилию.
//Экскурсовод ставит у себя в блокноте птичку и если количество людей по списку совпадает,
//Какой синхронизатор с библиотеки concurrent Вы бы использовали для данного процесса?
public class Bus_Task3 {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(20);
        Guide g = new Guide(countDownLatch);
        Bus b = new Bus(countDownLatch);
        Thread guide = new Thread(g);
        Thread bus = new Thread(b);

        guide.start();
        bus.start();

    }
}

class Guide implements Runnable{
    private CountDownLatch countDownLatch;

    public Guide(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            countDownLatch.countDown();
            System.out.println("Пассажир -> " + (i + 1) + " зарегистрирован на экскурсию");
        }
            try {
                countDownLatch.await();
                System.out.println("Все пассажиры в автобусе. Приятного путешествия!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }



    }
}

class Bus implements Runnable{
    private CountDownLatch countDownLatch;

    public Bus(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Автобус готов к экскурсии");

    }
}
