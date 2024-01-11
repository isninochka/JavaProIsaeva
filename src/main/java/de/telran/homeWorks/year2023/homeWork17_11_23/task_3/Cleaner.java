package de.telran.homeWorks.year2023.homeWork17_11_23.task_3;

public interface Cleaner {
    default void cleanTable(){
        System.out.println("Можно уже убрать со стола?");
    }
    default void washesDishes(){
        System.out.println("Я сейчас мою посуду");
    }

}
