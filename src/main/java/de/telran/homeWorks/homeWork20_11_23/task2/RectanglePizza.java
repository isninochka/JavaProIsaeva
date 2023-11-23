package de.telran.homeWorks.homeWork20_11_23.task2;

public class RectanglePizza {

    private final int width;
    private final int length;

    public RectanglePizza(int width, int length) {
        this.width = width;
        this.length = length;
    }

    protected void rectanglePizzaKalCalc(){
        int sum = width * length * PizzaKalCalc.KAL_PRO_CM;
        System.out.println("Количество калорий прямоугольной " +
                "пиццы с шириной "+ width +" и длиной "+ length + " равно "+ sum);

    }
}
