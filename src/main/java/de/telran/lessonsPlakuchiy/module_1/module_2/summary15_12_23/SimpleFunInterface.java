package de.telran.lessonsPlakuchiy.module_1.module_2.summary15_12_23;

public interface SimpleFunInterface {
    void doWork();
    default void doNotWork(){
        System.out.println("Default: do not Work");
    }
    static void sleep(){
        System.out.println("Default: Sleep");
    }
}
