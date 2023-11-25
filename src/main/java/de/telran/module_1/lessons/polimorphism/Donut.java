package de.telran.module_1.lessons.polimorphism;

public interface Donut {
    String addJam();
     default void eat(){
         System.out.println("I eat donut with "+ addJam());
     }
}
