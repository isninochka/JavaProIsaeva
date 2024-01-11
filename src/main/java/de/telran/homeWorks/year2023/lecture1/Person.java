package de.telran.homeWorks.year2023.lecture1;

public class Person {
    String fullName;
    int age;

    public Person() {

    }

    public  Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

     void move(){
        System.out.println(fullName + " двигается");
    }
     void talk(){
        System.out.println(fullName + " разговаривает");
    }

    public String getFullName() {
        return fullName;
    }

    void setFullName(String fullName) {
        this.fullName = fullName;
    }
}



