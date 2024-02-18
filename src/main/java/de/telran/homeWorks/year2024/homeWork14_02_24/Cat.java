package de.telran.homeWorks.year2024.homeWork14_02_24;

import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;

@Getter
@ToString
public class Cat {

    @Getter
    private double weight;
    @Getter
    private static int count;
    private static final int EYES_COUNT = 2;
    private static final double MIN_WEIGHT = 500;
    private static final double MAX_WEIGHT = 15000;
    @Getter
    private CatColor color;

    public Cat() {
        weight = 1500;
        count++;
        color = CatColor.getRandomColor();
    }

    public Cat(double weight) {
        this.weight = weight;
        count++;
        color = CatColor.getRandomColor();
    }


    public void meow() {
        if (weight > 0) {
            weight -= 1;
        }
    }

    public double eat(double amount) {
        if (weight > 0) {
            weight += amount;
            System.out.println("Кошечка покушала " + amount + " грамм корма");
        }
        return amount;
    }

    public void pee() {
        if (weight > 0) {
            weight -= 50;
            System.out.println("Кошечка сходила в туалет");
        }
    }

    public static boolean isAlive(double weight) {
        return weight > 0;
    }

    public Cat createDeepCopy() {
        Cat copy = new Cat();
        copy.weight = this.weight;
        copy.color = this.color;
        return copy;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();

        System.out.println("Вес кошки номер 1 -> " + cat1.getWeight());
        System.out.println("Вес кошки номер 2 -> " + cat2.getWeight());
        System.out.println("Вес кошки номер 3 -> " + cat3.getWeight());
        System.out.println("Вес кошки номер 4 -> " + cat4.getWeight());
        System.out.println("Вес кошки номер 5 -> " + cat5.getWeight());

        cat1.eat(150);
        cat2.eat(150);
        cat3.eat(150);
        cat4.eat(150);
        cat5.eat(150);

        cat1.pee();
        cat2.pee();
        cat3.pee();
        cat4.pee();
        cat5.pee();

        System.out.println("Вес кошки номер 1 -> " + cat1.getWeight());
        System.out.println("Вес кошки номер 2 -> " + cat2.getWeight());
        System.out.println("Вес кошки номер 3 -> " + cat3.getWeight());
        System.out.println("Вес кошки номер 4 -> " + cat4.getWeight());
        System.out.println("Вес кошки номер 5 -> " + cat5.getWeight());

        while (cat3.getWeight() > 0) {
            cat3.meow();
            if(!isAlive(cat3.getWeight())){
                System.out.println("Ваша кошечка " +cat3 +" долго мяукала и скончалась( ");
            }
        }
        int counter = 0;
        while (cat2.getWeight() > 0 && cat2.getWeight()<9000) {
            cat2.eat(500);

            counter++;
            System.out.println("Вы покормили свою кошечку "+ cat2 +counter+" раз и ее разорвало( ");

        }


        System.out.println("Количество кошек:");
        System.out.println(Cat.getCount());

        System.out.println("Цвет котов:");
        for (Cat cat : Arrays.asList(cat1, cat2, cat3, cat4, cat5)) {
            System.out.println(cat.color);
        }


    }
}

