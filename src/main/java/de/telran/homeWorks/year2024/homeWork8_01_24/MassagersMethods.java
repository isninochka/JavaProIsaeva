package de.telran.homeWorks.year2024.homeWork8_01_24;

public abstract class MassagersMethods<M> {
    private M massage;

    public void prepareData(){


    }
    public void generateReport(){

    }
    public void sendReport(){

    }

    public M getMassage() {
        return massage;
    }

    public void setMassage(M massage) {
        this.massage = massage;
    }
}
class Telegram <M extends MassagersMethods>{

}
