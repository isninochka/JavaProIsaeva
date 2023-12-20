package de.telran.homeWorks.homeWork18_12_23;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Task2 {
//    У нас есть профессия в строительстве - чернорабочий. Он может выполнять любые низкоквалифицированные работы на стройке.
//    На каждый день ему дается список работ, которые он должен выполнить, но не факт что в течении рабочего времени его задание
//    может измениться.
//    Напишите программу рабочего дня профессии, которая позволяет динамический давать ему задание на работу, в любое нужное время.
//    И он их должен выполнять.
//    Применяйте функциональные интерфейсы.

    public static void main(String[] args) {
        Supplier<String> getJob = ()->{
            String[] jobs = {"Разгрузить машину",
                            "Замесить бетон",
                            "Поклеить обои",
                            "Убрать мусор",
                            "Копать"};
            int randomJob = (((int)Math.random()*10)% jobs.length);
            return jobs[randomJob];
        };
        System.out.println(getJob.get());


    }


}

