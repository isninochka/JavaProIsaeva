package de.telran.module_1.lessons.lesson3.polimorfism;

public class GroomerShop {
    public void cut(Animal animal){
        System.out.println("Животное теперь подстрижено, довольно и говорит спасибо");
        animal.voice();
    }

    public void cutClaws(Cat cat){
        System.out.println("Когти подстрижены, теперь вы можете больше не бояться!");
        cat.voice();
        // можно передать метод из Анимал, а из Кота или домашнего кота, нельзя.

    }

    public int sum (Animal animal){
        return 10;
    }

    public int sum (Dog dog){
        return 20;
    }
    public int sum (Dog dog, Cat cat){
        return 15;
    }
}
