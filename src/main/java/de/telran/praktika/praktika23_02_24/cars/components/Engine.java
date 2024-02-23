package de.telran.praktika.praktika23_02_24.cars.components;

import lombok.Getter;

public class Engine {
    @Getter
    private double volume;
    @Getter
    private double mileage;
    @Getter
    private boolean isOn;
    private boolean isElectric;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }
    public void onEngine(){
        isOn = true;
    }
    public void offEngine(){
        isOn = false;
    }

    public void goEngine(double mileage){
        if(isOn){
            this.mileage+=mileage;
        }
        else {
            System.out.println("The engine is off");
        }
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}
