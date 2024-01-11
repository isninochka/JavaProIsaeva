package de.telran.module_4.lesson08_01_24;

import java.util.ArrayList;
import java.util.List;

public class TestWildcards {
    public static void main(String[] args) {
        List<BMW> list = new ArrayList<>();
        list.add(new BMW());

        List<? extends Car> garage = list; // если есть ? то это только для чтения
        garage
                .forEach(System.out::println);

        print(garage);
        //garage.add(new BMW());

    }
     static void print (List<? extends Car> garage){
         garage
                 .forEach(System.out::println);
     }
}

class Car{
    @Override
    public String toString() {
        return "I'm a Car{}";
    }
}

class BMW extends Car{
    @Override
    public String toString() {
        return "I'm a BMW{}";
    }
}