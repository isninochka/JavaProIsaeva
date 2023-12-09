package de.telran.homeWorks.homeWork08_12_23.task_3;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Transport {
    private TypeOfTransport typeOfTransport;
    private Petrol petrol;
    private String regNumber;



    @Override

    public String toString() {
        return "Transport{" +
                " " + typeOfTransport +
                " " + petrol +
                " " + regNumber + '\'' +
                '}';
    }
}
enum TypeOfTransport{
    CAR,
    MOTORCYCLE,
    BUS,
    AMBULANCE,
    POLICE,
    SNOWPLOW,
    SPECIAL_TRANSPORT,
    TRACTOR,
    TRUCK
}

enum Petrol{
    SUPER_95,
    SUPER_95_E10,
    ULTRA_98,
    DIESEL
}
