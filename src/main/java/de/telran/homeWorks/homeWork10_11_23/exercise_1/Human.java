package de.telran.homeWorks.homeWork10_11_23.exercise_1;

public class Human extends Earthman {

    private String name = "Nina";


    protected Human(String name){
      super(false, "Russia", 38);
      this.name = name;
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
