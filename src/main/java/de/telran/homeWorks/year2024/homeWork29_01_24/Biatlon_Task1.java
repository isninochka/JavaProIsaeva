package de.telran.homeWorks.year2024.homeWork29_01_24;
//На соревнованиях 5 спортсменов начинают одновременно стрелять в одну мишень.
//Если кто-нибудь в нее попадает(сделать Random-но), то мишень разрушается и другие в нее уже попасть не могут,
//но что-то пошло не так. Исправь программу, чтобы другие потоки "видели" изменения значения переменной isHit и
//больше его не меняли. Как только мишень разрушена кем то из стрелков, соревнования прекращаются.
//Воспользуйся классом AtomicBoolean и его методами.
import java.util.concurrent.atomic.AtomicBoolean;

public class Biatlon_Task1 {
    public static void main(String[] args) {

        AtomicBoolean isHit = new AtomicBoolean(false);
        int playerCount = 5;
        Thread[] players = new Thread[playerCount];

        for (int i = 0; i < playerCount; i++) {
            players[i] = new Thread(()-> {

                if(isHit.compareAndSet(false, true)){
                    System.out.println(Thread.currentThread().getName()+" попал в мишень!" +
                        "Мишень разрушена!!!");
                } else {
                    System.out.println(Thread.currentThread().getName()+ " не попал в мишень");
                }
            }, "Игрок "+(i+1));
        }
        for (int i = 0; i < playerCount; i++) {
            players[i].start();

        }

    }
}
