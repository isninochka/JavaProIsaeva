package de.telran.module_4.summary12_01_24;

public class Calc {
    public static void main(String[] args) {
        Operation<Integer,Double> operation = new Operation<>();
        System.out.println(operation.add(11,5));
        System.out.println(operation.div(11,5));

    }
}
class Operation<T extends Number, U extends Double> {
    public T add(T arg1, T arg2) {
        return (T) Double.valueOf(arg1.doubleValue()+arg2.doubleValue());
    }

    public U div(T arg1, T arg2) {
        return (U) Double.valueOf(arg1.doubleValue()/arg2.doubleValue());
    }
}


