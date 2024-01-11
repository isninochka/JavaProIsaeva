package de.telran.homeWorks.year2023.homeWork20_11_23.task1;

public class BelarusianHen extends Hen{
    int eggsCount;
    final String henCountry = "Беларусь";

    public BelarusianHen(int eggsCount) {
        this.eggsCount = eggsCount;
    }

    @Override
    public int getCountsOfEggsPerMonth() {
        return eggsCount;
    }

    @Override
    public String getDiscription() {
        return "Моя страна " + henCountry + ". Я несу "+ eggsCount + " яиц в месяц.";
    }

    @Override
    public String toString() {
        return "BelarusianHen{" +
                "eggsCount=" + eggsCount +
                ", henCountry='" + henCountry + '\'' +
                "} " + super.toString();
    }
}
