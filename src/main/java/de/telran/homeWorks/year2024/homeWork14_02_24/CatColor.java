package de.telran.homeWorks.year2024.homeWork14_02_24;

import java.util.Random;

public enum CatColor {
    WHITE,
    RED,
    BLACK,
    STRIPED,
    TRICOLOR;

    public static CatColor getRandomColor(){
        CatColor[] values = CatColor.values();
        int lenght = values.length;
        int index = new Random().nextInt(lenght);
        return values[index];
    }
}
