package de.telran.module_1.lessons.lesson3.polimorfism;

public class SimpleAnimal {
    public static void main(String[] args) {

    GroomerShop groomerShop =new GroomerShop();

    Animal animal = new Animal();
    animal.voice();
    groomerShop.cut(animal);

    animal = new Dog();
    animal.voice();
    groomerShop.cut(animal);

    animal = new Cat();
    animal.voice();
    groomerShop.cut(animal);


        System.out.println(groomerShop.sum(new Dog()));
        System.out.println(groomerShop.sum(new Dog(), new Cat()));

}
}