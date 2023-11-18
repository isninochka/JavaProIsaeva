package de.telran.module_1.lessons.lesson2.interface1;

public class CafeMashine implements RemouteRelation, AndroidApp{
    @Override
    public void switchOn() {
        System.out.println("Cafe On");

    }

    @Override
    public void switchOff() {
        System.out.println("Cafe Off");

    }

    @Override
    public void swithProgram() {
        System.out.println("Кофе готов");

    }

    @Override
    public void install() {
        System.out.println("Кофе машина инсталирована на Андроид"+FREE);
    }
}
