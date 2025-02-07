package ArrayList.Players;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class PlayerManager {
    private ArrayList<Player> players;

    public PlayerManager() {
        this.players = new ArrayList<>();
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void newPlayer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String name = sc.next();
        System.out.println("Score: ");
        int score = sc.nextInt();
        Player player = new Player(name,score);
        players.add(player);
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public Player searchPlayerName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the player's name to find the information: ");
        String namePlayer = sc.next();

        for (Player player : players) {
            if (player.getName().equalsIgnoreCase(namePlayer)) {
                return player;
            }
        }
        return null;
    }

    public void delPlayer(){
        players.remove(searchPlayerName());
    }

    public void updateScore(){
        Scanner sc = new Scanner(System.in);

        Player player = this.searchPlayerName();

        if(player != null){
            System.out.println("new score: ");
            int score = sc.nextInt();
            player.setScore(score);
        }
    }

    public void showTopNPlayersByScore(int n) {
        players.sort(new Comparator<Player>() {
            @Override
            public int compare(Player player1, Player player2) {
                return Integer.compare(player2.getScore(), player1.getScore());
            }
        });
        for (int i = 0; i < n && i < players.size(); i++) {
            System.out.println(players.get(i));
        }
    }


    public void showPlayersAboveScore(int minScore) {
        for (Player player : players) {
            if (player.getScore() > minScore) {
                System.out.println(player);
            }
        }
    }


    public void showHighestScoringPlayer() {
        if (players.isEmpty()) {
            System.out.println("No players available.");
            return;
        }

        Player highestScoringPlayer = players.get(0);
        for (Player player : players) {
            if (player.getScore() > highestScoringPlayer.getScore()) {
                highestScoringPlayer = player;
            }
        }
        System.out.println("The player with the highest score: " + highestScoringPlayer);
    }

    public void allPlayers(){
        for (Player player: players){
            System.out.println(player);
        }
    }
}
