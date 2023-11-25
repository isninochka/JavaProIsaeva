package de.telran.module_1.lessons.singleton;

public class SimpleGate {
    public static void main(String[] args) {


    Gate gate = Gate.getInstance(123);
    Gate gate1 = Gate.getInstance(123);

        System.out.println(gate==gate1);
        System.out.println(gate.equals(gate1));

        GateEnum instance = GateEnum.INSTANCE;
        GateEnum instance1 = GateEnum.INSTANCE;
        System.out.println(instance.equals(instance1));

    }
}
