package de.telran.module_3.lesson_2.summary22_12_23;

import lombok.AllArgsConstructor;

import java.util.List;

public class SimpleStream {
    public static void main(String[] args) {
        List<Worker> workers = List.of(new Worker("Vasia",2000),
        new Worker("Vasia",2000),
        new Worker("Petr",1000),
        new Worker("Lena",1500),
        new Worker("Grisha",1200),
        new Worker("Sergey",2500));

        System.out.println(workers.stream()
                .mapToInt(worker -> worker.salary)
                .summaryStatistics()

        );
        
    }
}
@AllArgsConstructor
class Worker{
    String name;
    int salary;
}
