package de.telran.module_1.lessons.lesson2;

public abstract class Animal {
    protected String type;
    protected abstract void voice();
    protected abstract void run();
    protected void rest(){
        System.out.println("Sleep");

    }
}
