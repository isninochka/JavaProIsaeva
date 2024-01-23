package de.telran.module_5.lesson_4;

public class SimpleCalc {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.div(5,2));

    }
}
class Calc{
    public int add(int a, int b) {
        return a+b;
    }

    public int sub(int a, int b) {
        return a-b;
    }

    public int mul (int a, int b) {
        return a*b;
    }

    public int div(int a, int b) {
        if (b==0)
            throw new IllegalArgumentException("Second parametr can not 0");
        return a/b;
    }
}
