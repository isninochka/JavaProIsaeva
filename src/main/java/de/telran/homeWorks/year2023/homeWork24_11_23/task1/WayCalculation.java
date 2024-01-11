package de.telran.homeWorks.year2023.homeWork24_11_23.task1;



public class WayCalculation  {


    private static double costToWay;
    private static double timeToWay;

    double wayKm;
    String transport;

    public WayCalculation(double wayKm) {
        this.wayKm = wayKm;

    }


    public double costCalc(String transport){


        switch (transport) {

            case "Plane" -> {
                costToWay = new Plane().getCostPerKm() * wayKm;
                System.out.println("The cost for a " + wayKm + " kilometers by plane, will be equal to ->" + costToWay);
                return costToWay;
            }
            case "Train" -> {
                costToWay = new Train().getCostPerKm() * wayKm;
                System.out.println("The cost for a " + wayKm + " kilometers by train, will be equal to ->" + costToWay);
                return costToWay;
            }
            case "Bus" -> {
                costToWay = new Bus().getCostPerKm() * wayKm;
                System.out.println("The cost for a " + wayKm + " kilometers by bus, will be equal to ->" + costToWay);
                return costToWay;
            }

        }
        return costToWay;
    }


    public double timeCalc(String transport){

        switch (transport) {
            case "Plane" -> {
                timeToWay = wayKm / new Plane().getSpeedKmPerHour();
                System.out.println("The time for a "+wayKm+" kilometers by plane, will be equal to ->"+ timeToWay+" hours");
                return timeToWay;
            }
            case "Train" -> {
                timeToWay = wayKm / new Train().getSpeedKmPerHour();
                System.out.println("The time for a "+wayKm+" kilometers by train, will be equal to ->"+ timeToWay+" hours");
                return timeToWay;
            }
            case "Bus" -> {
                timeToWay = wayKm / new Bus().getSpeedKmPerHour();
                System.out.println("The time for a "+wayKm+" kilometers by bus, will be equal to ->"+ timeToWay+" hours");
                return timeToWay;
            }
        }
        return timeToWay;
    }


}
