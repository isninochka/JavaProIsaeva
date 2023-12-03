package de.telran.homeWorks.homeWork29_11_23.task2.taski_a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class taski_a_1 {
    //Найти сумму всех элементов ArrayList.
    public static void main(String[] args) {
        ArrayList<Integer>intArrayList = new ArrayList<>();
        int sum = 0;
        for (Integer integer : intArrayList) {
            sum += integer;
        }
        System.out.println("Sum elements "+sum);
    }
}
class taski_a_2{
    //Найти среднее значение элементов LinkedList.
    public static void main(String[] args) {
        ArrayList<Integer>intArrayList = new ArrayList<>();

        int sum = 0;
        int average = 0;
        for (Integer integer : intArrayList) {
            sum += integer;
            average = sum/integer;
        }
        System.out.println("Average value " + average);
    }
}
//        intArrayList.add(3);
//                intArrayList.add(7);
//                intArrayList.add(6);
//                intArrayList.add(1);
//                intArrayList.add(2);
//                intArrayList.add(9);
class taski_a_3{
    //Перебрать ArrayList и вывести все элементы на экран.
    public static void main(String[] args) {
        ArrayList<Integer>intArrayList = new ArrayList<>();

        for (Integer integer: intArrayList) {
            System.out.println(integer);
        }
    }
}
class taski_a_4{
    //Перебрать LinkedList и найти самую длинную строку.

    public static void main(String[] args) {
        LinkedList<String>stringLinkedList = new LinkedList<>();
        String longestEl = "";
        for (String el : stringLinkedList){
            if (el.length() > longestEl.length()){
                longestEl = el;

            }
        }
        System.out.println("Longest element" +longestEl);

    }
}
class taski_a_5{
    public static void main(String[] args) {


    //Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
    ArrayList<Car> cars = new ArrayList<>();
    Car mazda = new Car("Mazda","RX-8",250);
    Car ford = new Car("Ford","Mustang", 270);
    Car bmw = new Car("BMW", "M5", 350);
    cars.add(mazda);
    cars.add(ford);
    cars.add(bmw);
        for (Car iterator:cars) {
            System.out.println(iterator.toString());
        }





    }
}
class Car{
    String marka;
    String model;
    int power;

    public Car(String marka, String model, int power) {
        this.marka = marka;
        this.model = model;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", power=" + power +
                '}';
    }
}
