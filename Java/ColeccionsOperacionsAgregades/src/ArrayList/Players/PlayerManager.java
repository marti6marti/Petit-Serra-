package ArrayList.Players;

import java.util.ArrayList;
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
//        System.out.println("Enter the player name to modify the score: ");
//        String namePlayer = sc.next();

        Player player = this.searchPlayerName();

        if(player != null){
            System.out.println("new score: ");
            int score = sc.nextInt();
            player.setScore(score);
        }
    }

    public Player allPlayers(){
        for (Player player: players){
            return player;
        }
        return null;
    }
}
