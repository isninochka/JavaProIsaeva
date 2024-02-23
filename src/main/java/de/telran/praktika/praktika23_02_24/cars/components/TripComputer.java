package de.telran.praktika.praktika23_02_24.cars.components;

import de.telran.praktika.praktika23_02_24.cars.Car;
import lombok.Setter;


public class TripComputer {
    private Car car;

    public void showFuel(){
        System.out.println("Fuel level -> "+ car.getFuel());
    }
    public void showStatus(){
        if(car.getEngine().isOn()){
            System.out.println("Car is started");
        } else {
            System.out.println("Car is not started");
        }
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
