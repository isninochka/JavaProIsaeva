package de.telran.module_1.summary;

import java.util.Arrays;

public class Ananas extends Fruit {
    private String country;
    public String constVal;

    public Ananas() {
        this.constVal = "Start";
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Ananas{" +
                "country='" + country + '\'' +
                "color='" + super.getColor() + '\'' +
                ", sugar=" + super.getSugar() +
                ", vitamins=" + Arrays.toString(super.getVitamins()) +

                "} " + super.toString();
    }
}
