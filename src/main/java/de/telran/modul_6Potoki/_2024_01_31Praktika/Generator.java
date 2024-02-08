package de.telran.modul_6Potoki._2024_01_31Praktika;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Generator {

    public static List<Action> actionListGenerator(int numGames){
        List<Action> actionsList = new ArrayList<>();
        for (int i =0; i < numGames; i++){
            actionsList.add(Action.randomAction(numGames));

        }
        System.out.println(actionsList);
        return actionsList;
    }

    public static List<GamePlayer> generatePlayers(Faker faker, int numPlayers){
        List<GamePlayer> players = new ArrayList<>();
        for (int i = 0; i < numPlayers; i++) {
            GamePlayer player = new GamePlayer(faker.name().name());
            players.add(player);

        }
        return players;
    }

    public static void playGame(List<GamePlayer>players, Action actions){
        int actionsIndex = 0;
        int numGames = 0;
        for (int i = 0; i < players.size()-1; i++) {
            for (int j = 0; j < players.size(); j++) {
                GamePlayer player1 = players.get(i);
                GamePlayer player2 = players.get(j);
                Action action =actions.randomAction(numGames);
                int result = player1.opponentChoose(player2,action);
                if(result == 1){
                    player1.addScore(1.0);
                } else if (result == -1) {
                    player2.addScore(1.0);
                }else {
                    player1.addScore(0.5);
                    player2.addScore(0.5);
                }
                actionsIndex++;

            }

        }

    }
    public static Map<GamePlayer, Double> calculateScores(List<GamePlayer> players) {
        Map<GamePlayer, Double> scores = new HashMap<>();
        for (GamePlayer player : players) {
            scores.put(player, player.getScore());
        }
        return scores;
    }

    public static List<GamePlayer> getLeaders(Map<GamePlayer, Double> scores){
        List<GamePlayer> leaders = new ArrayList<>();
        double maxScore = 0;

        for (Map.Entry<GamePlayer,Double> entry: scores.entrySet()){
            double score = entry.getValue();
            if(score >= maxScore){
                if(score>maxScore){
                    leaders.clear();
                    maxScore = score;
                }
                leaders.add(entry.getKey());
            }
        }
        return leaders;
    }

    public static void printResult(List<GamePlayer> players, Map<GamePlayer,Double> scores,List<GamePlayer>leaders){
        System.out.println("Таблица результатов -> ");
        System.out.println("Игрок\t\t\tОчки");

        for (GamePlayer player: players){
            System.out.println(player.getName() + "\t\t" + scores.get(player));
        }
        System.out.println("\nТройка лидеров:");
        for (int i = 0; i < Math.min(leaders.size(), 3); i++) {
            System.out.println((i + 1) + ". " + leaders.get(i).getName() + " - " + scores.get(leaders.get(i)) + " очков");
    }



}

class ActionsListGenerator implements Runnable{
    int numGames;
    int numPlayers;
    Faker faker;
    @Override
    public void run() {
        for (int i = 1; i < numPlayers; i++) {
            System.out.println(Thread.currentThread().getName()+i);
            Generator.generatePlayers(faker, numPlayers);

        }
    }
}
}
