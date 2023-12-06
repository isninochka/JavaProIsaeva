package de.telran.module_2.lesson4Data;

import java.util.Comparator;
import java.util.Objects;

public class Cat implements Comparable<Cat> {
    private String name;
    private String breed;
    private int age;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age);
    }

    public Cat() {
    }

    public Cat(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Cat cat) {
        if(this.age<cat.age)
            return -1;
        else if (this.age> cat.age)
            return 1;
        else {
            int res = this.name.compareTo(cat.name);
            if(res ==0);
            return this.breed.compareTo(cat.breed);
        }


    }
}
