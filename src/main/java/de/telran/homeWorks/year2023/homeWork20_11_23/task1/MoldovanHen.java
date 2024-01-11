package de.telran.homeWorks.year2023.homeWork20_11_23.task1;

public class MoldovanHen extends Hen{
    int eggsCount;
    final String henCountry = "Молдова";

    public MoldovanHen(int eggsCount) {
        this.eggsCount = eggsCount;
    }

    @Override
    public int getCountsOfEggsPerMonth() {
        return eggsCount;
    }


    public String getDiscription() {
        return "Моя страна " + henCountry + ". Я несу "+ eggsCount + " яиц в месяц.";
    }

    @Override
    public String toString() {
        return "MoldovanHen{" +
                "eggsCount=" + eggsCount +
                ", henCountry='" + henCountry + '\'' +
                "} " + super.toString();
    }
}
