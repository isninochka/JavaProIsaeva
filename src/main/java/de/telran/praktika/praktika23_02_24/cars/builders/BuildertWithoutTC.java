package de.telran.praktika.praktika23_02_24.cars.builders;

import de.telran.praktika.praktika23_02_24.cars.car.CarType;
import de.telran.praktika.praktika23_02_24.cars.components.Engine;
import de.telran.praktika.praktika23_02_24.cars.components.GPSNavigator;
import de.telran.praktika.praktika23_02_24.cars.components.Transmission;
import de.telran.praktika.praktika23_02_24.cars.components.TripComputer;

public interface BuildertWithoutTC {
    void setCarType(CarType carType);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setSeats(int seats);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
