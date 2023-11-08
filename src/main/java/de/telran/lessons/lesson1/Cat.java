package de.telran.lessons.lesson1;

public class Cat {
    String name;
    int weight;
    int age;
    private boolean sterilized;

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    void sayMiau(){
        System.out.println("Кошка с именем: " + name + " возрастом: " +age+ " весом: "+weight+ " мяукает! Мяу! Мяу!");
    }

    void sleep(){
        System.out.println("Кошка с именем: " + name + " возрастом: " +age+ " весом: "+weight+ " спит!!!");
    }
    void eat(){
        System.out.println("Кошка с именем: " + name + " возрастом: " +age+ " весом: "+weight+ " ест!!");
    }
}




