package de.telran.homeWorks.HomeWork20_11_23.task1;

public class RussianHen extends Hen {

    int eggsCount;
    final String henCountry = "Россия";

    public RussianHen(int eggsCount) {
        this.eggsCount = eggsCount;
    }

    @Override
    public int getCountsOfEggsPerMonth() {
        return eggsCount;
    }


    public String getDiscription() {
        return "Моя страна " + henCountry + ". Я несу "+ eggsCount + "яиц в месяц.";
    }

    @Override
    public String toString() {
        return "RussianHen{" +
                "eggsCount=" + eggsCount +
                ", henCountry='" + henCountry + '\'' +
                "} " + super.toString();
    }
}
