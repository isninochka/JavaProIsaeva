package de.telran.modul_6Potoki._2024_01_31Praktika;

import java.util.ArrayList;
import java.util.List;


public class Generator {
    public static void main(String[] args) {
        ActionsListGenerator generator = new ActionsListGenerator();
        Thread pl = new Thread(generator, "Player");
        pl.start();


    }

    public static List<Action> listGenerator(){
        List<Action> actionsList = new ArrayList<>();
        for (int i =0; i < 10; i++){
            actionsList.add(Action.randomAction());

        }
        System.out.println(actionsList);
        return actionsList;
    }




}

class ActionsListGenerator implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            Generator.listGenerator();

        }
    }
}
