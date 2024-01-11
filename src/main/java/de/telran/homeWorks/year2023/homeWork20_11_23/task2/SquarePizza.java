package de.telran.homeWorks.year2023.homeWork20_11_23.task2;

public class SquarePizza {
    private final int width;

    public SquarePizza(int width) {
        this.width = width;
    }

    protected void squarePizzaKalCalc(){
        int sum = width * width * PizzaKalCalc.KAL_PRO_CM;
        System.out.println("Количество калорий квадратной " +
                "пиццы со стороной равной "+ width+ " равно "+sum);
        }
}
