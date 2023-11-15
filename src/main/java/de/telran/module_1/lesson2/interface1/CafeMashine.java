package de.telran.module_1.lesson2.interface1;

public class CafeMashine implements RemouteRelation{
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
}
