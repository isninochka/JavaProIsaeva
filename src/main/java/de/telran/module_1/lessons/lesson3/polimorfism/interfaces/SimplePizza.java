package de.telran.module_1.lessons.lesson3.polimorfism.interfaces;

public class SimplePizza {
    public static void main(String[] args) {
        PizzaEngine pizzaEngine = new PizzaEngine();
        pizzaEngine.orderPizza();

        Pizzeola pizzeola = pizzaEngine;
        pizzeola.cookIngredients();
        pizzeola.cookPizza();

        Courier courier = pizzaEngine;
        courier.packPizza();
        courier.deliveryPizza();

        pizzaEngine.eatPizza();




    }
}
