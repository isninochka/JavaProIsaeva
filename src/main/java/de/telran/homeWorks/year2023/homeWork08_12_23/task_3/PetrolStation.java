package de.telran.homeWorks.year2023.homeWork08_12_23.task_3;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PetrolStation {

    public static void main(String[] args) {
        PetrolStationEmployees employees = new PetrolStationEmployees();


        PriorityQueue<Transport> carsQueue = new PriorityQueue<>(new Comparator<Transport>() {
            @Override
            public int compare(Transport o1, Transport o2) {
                if(o1.getTypeOfTransport().equals(TypeOfTransport.AMBULANCE))
                    return -1;
                if (o2.getTypeOfTransport().equals(TypeOfTransport.AMBULANCE))
                    return 1;
                if(o1.getTypeOfTransport().equals(TypeOfTransport.BUS))
                    return -1;
                if (o2.getTypeOfTransport().equals(TypeOfTransport.BUS))
                    return 1;
                if(o1.getTypeOfTransport().equals(TypeOfTransport.SNOWPLOW))
                    return -1;
                if (o2.getTypeOfTransport().equals(TypeOfTransport.SNOWPLOW))
                    return 1;
                return 0;

            }
        });
        carsQueue.add(new Transport(TypeOfTransport.CAR,Petrol.SUPER_95,"HM919"));
        carsQueue.add(new Transport(TypeOfTransport.MOTORCYCLE,Petrol.ULTRA_98,"HH001"));
        carsQueue.add(new Transport(TypeOfTransport.CAR,Petrol.ULTRA_98,"WF456"));
        carsQueue.add(new Transport(TypeOfTransport.BUS,Petrol.DIESEL,"HM050"));
        carsQueue.add(new Transport(TypeOfTransport.CAR,Petrol.DIESEL,"H777"));
        carsQueue.add(new Transport(TypeOfTransport.TRACTOR,Petrol.SUPER_95_E10,"GF333"));
        carsQueue.add(new Transport(TypeOfTransport.TRUCK,Petrol.DIESEL,"B666"));
        carsQueue.add(new Transport(TypeOfTransport.CAR,Petrol.SUPER_95,"LIP789"));
        carsQueue.add(new Transport(TypeOfTransport.CAR,Petrol.SUPER_95,"LIP788"));
        carsQueue.add(new Transport(TypeOfTransport.POLICE,Petrol.ULTRA_98,"KÖ222"));
        carsQueue.add(new Transport(TypeOfTransport.BUS,Petrol.DIESEL,"HM009"));

        System.out.println(carsQueue);

        // Приоритет час пик и автобусы, в отсутствии скорой
        employees.refuelingCar();
        System.out.println(carsQueue.poll());
        employees.takeMoney();

        // на заправку заехала скорая
        System.out.println("ВИУ-ВИУ-ВИУ");
        carsQueue.add(new Transport(TypeOfTransport.AMBULANCE,Petrol.DIESEL,"HM911"));
        employees.refuelingCar();
        System.out.println(carsQueue.poll());
    }
}
