package de.telran.homeWorks.year2023.lecture1;

public class Phone {
    String number;
    String model;
    int weight;
    String name;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name){
        System.out.println("Звонит "+ name);
    }
    }