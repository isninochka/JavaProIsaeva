package de.telran.homeWorks.HomeWork20_11_23.task2;

public class CirclePizza {
    private final int radius;

    public CirclePizza(int radius) {
        this.radius = radius;
    }
    public void  circlePizzaKalCalc(){
        int sum = radius * radius * PizzaKalCalc.KAL_PRO_CM;
        System.out.println("Количество калорий круглой " +
                "пиццы с радиусом "+ radius + " равно "+ sum);
    }
}
