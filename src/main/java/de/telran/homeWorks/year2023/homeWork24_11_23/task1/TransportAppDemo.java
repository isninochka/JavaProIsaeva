package de.telran.homeWorks.year2023.homeWork24_11_23.task1;

import java.util.Scanner;

public class TransportAppDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the number of kilometers to your destination -> ");

        WayCalculation wayCalcPlane = new WayCalculation(scanner.nextInt());

        System.out.println("Do you need to choose the cheapest or fastest transport? (write the word cheap or fast) ");
        String answer = scanner.nextLine();

        switch (scanner.nextLine()) {
            case "cheap" -> {
                wayCalcPlane.costCalc("Bus");
                wayCalcPlane.timeCalc("Bus");

            }
            case "fast" -> {
                wayCalcPlane.timeCalc("Plane");
                wayCalcPlane.costCalc("Plane");
            }
            default -> {
                System.out.println("Incorrect word. Try again");
            }

        }

    }
}