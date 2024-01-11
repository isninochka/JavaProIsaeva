package de.telran.homeWorks.year2023.homeWork17_11_23.task_3;

public interface Cook {

    default void cooking(String dish){
        System.out.println("Я готовлю "+ dish);
    }
    default void bringOrder(String dish){
        System.out.println("Заказ "+ dish +" готов. Приятного аппетита!");
    }
    default void washesDishes(){
        System.out.println("Очень редко, но мне тоже, приходится мыть посуду");
    }
}
