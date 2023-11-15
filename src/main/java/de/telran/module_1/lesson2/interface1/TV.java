package de.telran.module_1.lesson2.interface1;

public class TV implements RemouteRelation{
    @Override
    public void switchOn() {
        System.out.println("TV on");
    }

    @Override
    public void switchOff() {
        System.out.println("TV off");

    }

    @Override
    public void swithProgram() {
        System.out.println("TV changed channel");

    }
}
