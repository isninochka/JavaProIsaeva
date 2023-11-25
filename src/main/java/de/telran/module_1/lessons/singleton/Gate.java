package de.telran.module_1.lessons.singleton;

public class Gate {
    private static Gate instance;
    private final double radioGerz;

    public void openGate(){
        System.out.println("Gate open ->"+radioGerz);

    }
    public void closeGate(){
        System.out.println("Gate close ->"+radioGerz);

    }

    private Gate(double radioGerz) {
        this.radioGerz = radioGerz;
    }
    public static Gate getInstance(double radioGerz){
        if (instance == null){
            instance = new Gate(radioGerz);
        }

        return instance;
    }
}
