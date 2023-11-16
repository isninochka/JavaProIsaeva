package de.telran.homeWorks.homeWork10_11_23.exercise_1;

final class Engineer extends Employee {
    final static String position = "Инженер";

    private static void beingEngineer() {
        System.out.println("Я человек высококвалифицированный и теперь я работаю на должности "+ position);
    }

    public static void main(String[] args) {

        birthEarthman();
        beingHuman();
        beingEmployee();
        beingEngineer();
    }
}

