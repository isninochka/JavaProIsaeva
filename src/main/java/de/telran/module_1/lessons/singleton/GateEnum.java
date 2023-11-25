package de.telran.module_1.lessons.singleton;

public enum GateEnum {
    INSTANCE(123),
    ;
    private double radioGerz;

    GateEnum(double radioGerz) {
        this.radioGerz = radioGerz;
    }
}
