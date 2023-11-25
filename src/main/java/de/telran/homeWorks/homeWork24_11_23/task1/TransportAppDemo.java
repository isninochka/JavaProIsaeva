package de.telran.homeWorks.homeWork24_11_23.task1;

public class TransportAppDemo {

    public static void main(String[] args) {


       WayCalculation wayCalcPlane = new WayCalculation (200,"Plane");
        wayCalcPlane.costCalc();
        wayCalcPlane.timeCalc();
        WayCalculation wayCalcTrain = new WayCalculation(200,"Train");
        wayCalcTrain.costCalc();
        wayCalcTrain.timeCalc();



    }
}
