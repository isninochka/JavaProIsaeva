package de.telran.module_4.lesson08_01_24.praktica08_01_24.ex;

import com.github.javafaker.Faker;

import java.util.Random;

public class Main {
    private static final Faker FAKER = new Faker();
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Kid kid1 = new Kid(FAKER.name().name(), RANDOM.nextInt(11));
        Kid kid2 = new Kid(FAKER.name().name(), RANDOM.nextInt(11));
        TeenAger teenAger1 = new TeenAger(FAKER.name().name(), RANDOM.nextInt(19));
        TeenAger teenAger2 = new TeenAger(FAKER.name().name(), RANDOM.nextInt(19));
        Adult adult1 = new Adult(FAKER.name().name(), RANDOM.nextInt(11));
        Adult adult2 = new Adult(FAKER.name().name(), RANDOM.nextInt(11));

        Team<Kid> kid1Team = new Team<>(FAKER.team().name());
        Team<Kid> kid2Team = new Team<>(FAKER.team().name());
        kid1Team.addNewParticipant(kid1);
        kid2Team.addNewParticipant(kid2);

        Team<TeenAger> teenAgerTeam1 = new Team<>(FAKER.team().name());
        Team<TeenAger> teenAgerTeam2 = new Team<>(FAKER.team().name());
        teenAgerTeam1.addNewParticipant(teenAger1);
        teenAgerTeam2.addNewParticipant(teenAger2);

        kid1Team.play(kid2Team);
    }
}
