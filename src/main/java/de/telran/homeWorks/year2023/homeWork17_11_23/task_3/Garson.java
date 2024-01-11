package de.telran.homeWorks.year2023.homeWork17_11_23.task_3;

public interface Garson {
    default void order(String dish){
        System.out.println("Вы заказали "+dish);

    }
    default void bringOrder(String dish){
        System.out.println("Вот ваш заказ "+dish+" Приятного аппетита!");
    }
    default void acceptPay(double sum) {
        System.out.println("К оплате " + sum);
    }
    default void cleanTable(){
        System.out.println("Я могу уже это убрать?");
    }

}
