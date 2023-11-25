package de.telran.module_1.lessons.polimorphism;

public class DonutsFactory {

    public  Donut getInstance(DonutType type){

        return switch (type) {
            case CHERRY -> new CherryDonut();
            case CARAMEL -> new CaramelDonut();
            case CHOCOLATE -> new ChokoDonut();
        };

    }
}
