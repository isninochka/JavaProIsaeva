package de.telran.module_1.lessons.lesson3.statics;

public class Cat {
    public String name;
    static int countCats;
    private  int age;

    public Cat(String name) {
        this.name = name;

        countCats++;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static void inc(){
        countCats++;
    }
}
