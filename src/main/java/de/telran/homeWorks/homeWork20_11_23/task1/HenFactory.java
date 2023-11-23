package de.telran.homeWorks.homeWork20_11_23.task1;

public class HenFactory {


    Hen russianHen = new RussianHen(320);
    Hen ukraineanHen = new UkrainianHen(350);

    Hen moldovanHen = new MoldovanHen(380);
    Hen belarusianHen = new BelarusianHen(400);


        public Hen getHen(String country){
            switch (country) {
                case "Россия":
                    System.out.println(russianHen.getDiscription() + " -> "
                            +russianHen.getCountsOfEggsPerMonth());
                   break;
                case "Украина":
                    System.out.println(ukraineanHen.getDiscription() + " -> "
                            +ukraineanHen.getCountsOfEggsPerMonth());
                    break;
                case "Молдова":
                    System.out.println(moldovanHen.getDiscription() + " -> "
                            +moldovanHen.getCountsOfEggsPerMonth());
                    break;
                case "Беларусь":
                    System.out.println(belarusianHen.getDiscription() + " -> "
                            +belarusianHen.getCountsOfEggsPerMonth());
                    break;
            } return null;
        }
    }

