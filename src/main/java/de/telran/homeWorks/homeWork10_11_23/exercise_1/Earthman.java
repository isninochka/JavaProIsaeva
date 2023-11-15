package de.telran.homeWorks.homeWork10_11_23.exercise_1;

 class Earthman {
     protected boolean genderMan;
     
     private String country;
    private int age;

 

    public Earthman(boolean genderMan, String country, int age)
    {
        this.genderMan = genderMan;
        this.country = country;
        this.age = age;
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

     @Override
     public String toString() {
         return "Earthman{" +
                 "genderMan=" + genderMan +
                 ", country='" + country + '\'' +
                 ", age=" + age +
                 '}';
     }
 }
