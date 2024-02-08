package de.telran.modul_6Potoki._2024_01_31Praktika;

import com.github.javafaker.Faker;
import lombok.Getter;

import java.util.List;
import java.util.Map;

public class Game {
    public static void main(String[] args) {

        int numPlayers = 10;
        int numGames = (numPlayers-1)*numPlayers/2;
        Faker faker = new Faker();

        List<GamePlayer> players = Generator.generatePlayers(faker,numPlayers);
        Action actions = Action.randomAction(numGames);

        Generator.playGame(players,actions);
        Map<GamePlayer,Double> scores = Generator.calculateScores(players);
        List<GamePlayer> leaders = Generator.getLeaders(scores);
        Generator.printResult(players,scores,leaders);
    }
}
@Getter
class GamePlayer{
    private String name;
    private double score;

    public GamePlayer(String name) {
        this.name = name;

    }
    void addScore(double points){
        score += points;
    }

    int opponentChoose(GamePlayer opponent, Action action) {
        int numGames =0;
        Action opponentAction = action.randomAction(numGames);
        System.out.println(name + " выбрал " + action + ", " + opponent.getName() + " выбрал " + opponentAction);
        if (action == opponentAction) {
            return 0;
        } else if ((action == Action.STONE && opponentAction == Action.SCISSORS) ||
                (action == Action.SCISSORS && opponentAction == Action.PAPER) ||
                (action == Action.PAPER && opponentAction == Action.STONE)) {
            return 1;
        } else {
            return -1;

        }
    }
}



