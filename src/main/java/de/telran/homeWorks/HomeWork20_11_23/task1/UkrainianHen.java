package de.telran.homeWorks.HomeWork20_11_23.task1;

class UkrainianHen extends Hen {

    int eggsCount;
    final String henCountry = "Украина";

    public UkrainianHen(int eggsCount) {
        this.eggsCount = eggsCount;
    }

    @Override
    public int getCountsOfEggsPerMonth() {
        return eggsCount;
    }


    public String getDiscription() {
       return  "Моя страна " + henCountry + ". Я несу "+ eggsCount + "яиц в месяц.";
    }

    @Override
    public String toString() {
        return "UkrainianHen{" +
                "eggsCount=" + eggsCount +
                ", henCountry='" + henCountry + '\'' +
                "} " + super.toString();
    }
}
