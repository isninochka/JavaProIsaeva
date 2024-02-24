package de.telran.praktika.praktika23_02_24.cars.car;

import de.telran.praktika.praktika23_02_24.cars.components.Engine;
import de.telran.praktika.praktika23_02_24.cars.components.GPSNavigator;
import de.telran.praktika.praktika23_02_24.cars.components.Transmission;
import lombok.Setter;
import lombok.ToString;

@ToString
public class CarWithoutTC {
    private final CarType carType;
    private final Engine engine;
    private final Transmission transmission;
    private int seats;
    private final GPSNavigator gpsNavigator;
    @Setter
    private double fuel = 0;

    public CarWithoutTC(CarType carType, Engine engine, Transmission transmission, int seats, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.engine = engine;
        this.transmission = transmission;
        this.seats = seats;
        this.gpsNavigator = gpsNavigator;
    }
}
