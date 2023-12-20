package de.telran.module_3.lesson_2.practika18_12_23;

public class Test {
    public static void main(String[] args) {
        m((Test::ref));

    }

    public static void ref(){
        System.out.println("Inter Method");
    }

    public static void m(Inter inter){

    }

}
@FunctionalInterface
interface Inter{
    void get();

}
