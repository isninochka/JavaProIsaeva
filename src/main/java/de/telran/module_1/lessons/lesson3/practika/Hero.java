package de.telran.module_1.lessons.lesson3.practika;

public abstract class Hero {

    String heroName;
    double power;
    double liveLevel;


    public Hero(String heroName, double power, double liveLevel) {
        this.heroName = heroName;
        this.power = power;
        this.liveLevel = liveLevel;
    }

    abstract void attack();

    abstract void say();
}

class Elf extends Hero implements Flyable{


    public Elf(String heroName, double power, double liveLevel) {
        super(heroName, power, liveLevel);
    }

    @Override
    void attack() {

    }

    @Override
    void say() {

    }


    @Override
    public void fly() {

    }
}

interface Flyable{
    void fly();


    default void test1(){
        System.out.println("test1");
    }

    static void test2(){
        System.out.println("test2");
    }
}