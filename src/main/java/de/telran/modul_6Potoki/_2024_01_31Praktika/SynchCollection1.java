package de.telran.modul_6Potoki._2024_01_31Praktika;

import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Exchanger;

/**
 * - класс который содержит метод для генерации 10 экшонов лист
 * - необходимо что бы сыграли 10 игроков каждый с каждым короме самого себя естественно
 * - победа 1 бал, ничья 0,5, проигрыш 0
 * - после всех игр записать в какую нить структуру данных у кого сколько баллов
 * - найти первые 3 лидирующих балла
 * - если у лидеров одинаковые баллы то они переигрывают между собой столько пока не определить тройка лидеров
 * - вывести тройку лидеров и таблицу всех участников
 */
public class SynchCollection1 {
    private static final Faker FAKER = new Faker();
    public static void main(String[] args) {
        Exchanger<Action> exchanger  = new Exchanger<>();

        List<Action> p1Action = Arrays.asList(Action.SCISSORS, Action.PAPER, Action.SCISSORS);
        List<Action> p2Action = Arrays.asList(Action.PAPER, Action.PAPER, Action.STONE);

        new Player(FAKER.name().firstName(), p1Action, exchanger);
        new Player(FAKER.name().firstName(), p2Action, exchanger);
    }
}

enum Action {
    PAPER,
    STONE,
    SCISSORS;

    private static final Random random = new Random();
    public static Action randomAction(){
        Action[] actions = values();
        return actions[random.nextInt(actions.length)];
    }
}

class Player extends Thread{
    private String name;
    private List<Action> actions;
    private Exchanger<Action> exchanger;

    public Player(String name, List<Action> actions, Exchanger<Action> exchanger) {
        this.name = name;
        this.actions = actions;
        this.exchanger = exchanger;
        this.start();
    }

    public void getWinner(Action actionP1, Action actionP2) {
        if(actionP1 == Action.STONE && actionP2 == Action.SCISSORS ||
           actionP1 == Action.PAPER && actionP2 == Action.STONE ||
           actionP1 == Action.SCISSORS && actionP2 == Action.PAPER) {
            System.out.println("WINNER: " + name);
        }
    }

    @Override
    public void run() {
        Action reply;
        for (Action ac : actions) {
            try {
                reply = exchanger.exchange(ac);
                getWinner(ac, reply);
                sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}