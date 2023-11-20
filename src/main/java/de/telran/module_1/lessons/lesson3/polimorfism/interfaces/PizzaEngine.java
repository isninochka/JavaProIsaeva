package de.telran.module_1.lessons.lesson3.polimorfism.interfaces;

public class PizzaEngine implements Customer, Pizzeola, Courier{
    @Override
    public void orderPizza() {
        System.out.println("Мне, пожалуйста, пуццу-Маргаритту");
    }

    @Override
    public void eatPizza() {
        System.out.println("Спасибо, очень вкусно");

    }

    @Override
    public void cookIngredients() {
        System.out.println("Подготавливаю ингредиенты");

    }

    @Override
    public void cookPizza() {
        System.out.println("Пицца готова, приятного аппетита");
    }

    @Override
    public void packPizza() {
        System.out.println("Пицца упакована");
    }

    @Override
    public void deliveryPizza() {
        System.out.println("Ваша пицца, приятного аппетита!");
    }
}
