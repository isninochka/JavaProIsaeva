package de.telran.homeWorks.year2024.homeWork26_01_24;

import java.util.Scanner;

// Вы въезжаете в отель и подходите к стойке администратора. За стойкой никого нет, но на ней стоит звоночек,
// используя который Вы можете позвать администратора. Т.к. наплыв гостей очень редко бывает большим,
// чтобы организовывалась очередь, администратор обычно "уходит по своим делам", обслужив Вас и ждет следующего звонка.
// Напишите программу, которая автоматизирует данный процесс обслуживания.
//  Гость и Администратор - отдельные потоки приложения.
//  Используйте wait / notify механизм многопоточности
public class Task1_Hotel {
    public static void main(String[] args) {
        Bell bell = new Bell();

        Thread hotel = new Thread();
        System.out.println("Отель открылся");
        hotel.start();

        Guest g = new Guest(bell);
        Guest g2 = new Guest(bell);
        Receptionist r = new Receptionist(bell);
        Thread guest1 = new Thread(g,"Гость1");
        Thread guest2 = new Thread(g2,"Гость2");
        Thread receptionist = new Thread(r,"Администратор");



        guest1.start();
        receptionist.start();
        guest2.start();

        try {

            receptionist.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Отель закрылся");

    }
}

class Bell {

    private boolean isCalling =false;

    public void pressBell() {
        synchronized (this) {
            if (isCalling) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(Thread.currentThread().getName());
            System.out.println(" Я приехал в отель и жду пока меня зарегистрируют.");
            isCalling = true;
            notify();

        }
    }

    public void hearBell() {
        synchronized (this) {


            if (!isCalling) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(Thread.currentThread().getName());
            System.out.println(" Бегу вас регистрировать");
            isCalling = false;
            notify();
        }
    }



}
class Guest implements Runnable{

    private Bell bell;

    public Guest(Bell bell) {
        this.bell = bell;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            bell.pressBell();
        }

    }
}
class Receptionist implements Runnable{
    private Bell bell;

    public Receptionist(Bell bell) {
        this.bell = bell;
    }

    @Override
    public void run() {
        bell.hearBell();
    }
}
