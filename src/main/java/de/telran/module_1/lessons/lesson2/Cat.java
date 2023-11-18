package de.telran.module_1.lessons.lesson2;

public class Cat extends Animal{
    String name;


    @Override
    protected void voice() {
        System.out.println("Miau!");

    }

    @Override
    protected void run() {
        System.out.println("Running");

    }
}
