package de.telran.homeWorks.homeWork08_12_23.task_1_2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public class Brick{

    private BrickType brickType;
    private int quantity;
    private String manufacturer;
    private String country;

    @Override
    public String toString() {
        return "Кирпич{" +
                " тип " + brickType +
                ", кол-во " + quantity +
                ", производитель " + manufacturer +
                ", страна " + country  +
                '}';
    }
}
enum BrickType{
    CERAMIC_BRICK,
    SILICATE_BRICK,
    FIRECLAY_BRICK,
    CLINKER_BRICK,
    HYPPER_PRESSED_BRICK
}





