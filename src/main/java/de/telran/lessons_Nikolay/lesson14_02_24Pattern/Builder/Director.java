package de.telran.lessons_Temnyakov.lesson14_02_24Pattern.Builder;

import de.telran.lessons_Temnyakov.lesson14_02_24Pattern.Builder.Builder;

public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    public void construct(){
        this.builder.buildPartA();
        this.builder.buildPartB();
        this.builder.buildPartC();
        this.builder.buildPartD();
        this.builder.buildPartE();


    }
}
