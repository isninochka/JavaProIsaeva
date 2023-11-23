package de.telran.homeWorks.HomeWork20_11_23.task2;

public class PizzaKalCalc {
    static final int KAL_PRO_CM = 40;

    public static void main(String[] args) {

        new SquarePizza(30).squarePizzaKalCalc();
        new RectanglePizza(20,10).rectanglePizzaKalCalc();
        new CirclePizza(50).circlePizzaKalCalc();



    }
}
