package de.telran.homeWorks.year2023.homeWork06_12_23.task_3;

import lombok.*;

import java.util.Objects;


@AllArgsConstructor
@Getter
@Setter
@ToString

public class Bus {
    private String coordinates;
    private int routeNumber;
    private String busNumber;



    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Bus bus = (Bus) object;
        return Objects.equals(busNumber, bus.busNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(busNumber);
    }
}



