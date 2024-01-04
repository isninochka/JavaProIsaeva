package de.telran.module_3.lesson_2.summary22_12_23;

import java.util.function.BiConsumer;


public class SimpleWorker {
    public static void main(String[] args) {
        BiConsumer<String, String> work =((name, job) ->standartWork(name,job));
        work.accept("Stas","Cleaning");
    }
    static void standartWork(String worker, String work){
        System.out.println(worker+" выполняет "+work);
    }
}

