package de.telran.module_4.lesson08_01_24.praktica08_01_24.ex;

public class Participant {
    private String name;
    private int age;

    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Kid extends Participant {

    public Kid(String name, int age) {
        super(name, age);
    }
}

class TeenAger extends Participant {

    public TeenAger(String name, int age) {
        super(name, age);
    }
}

class Adult extends Participant {

    public Adult(String name, int age) {
        super(name, age);
    }
}
