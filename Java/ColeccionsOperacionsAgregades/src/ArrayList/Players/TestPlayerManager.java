package ArrayList.Players;

import java.util.Scanner;

public class TestPlayerManager {
    public static void main(String[] args) {
        PlayerManager pm = new PlayerManager();
        Player player1 = new Player("Miquel",10);
        Player player2 = new Player("Marc",5);
        Player player3 = new Player("Martí",15);
        Player player4 = new Player("Max",33);
        Player player5 = new Player("Pol",24);

        pm.addPlayer(player1);
        pm.addPlayer(player2);
        pm.addPlayer(player3);
        pm.addPlayer(player4);
        pm.addPlayer(player5);


        Scanner sc = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {

            System.out.println("\nPlayer management system:");
            System.out.println("1. Add a player.");
            System.out.println("2. Remove a player by name.");
            System.out.println("3. Search for a player by name.");
            System.out.println("4. Update a player's score.");
            System.out.println("5. Show the top N players by score.");
            System.out.println("6. Show players with a score above a certain value.");
            System.out.println("7. Show the player with the highest score.");
            System.out.println("8. Show all current players.");
            System.out.println("9. Exit.");
            System.out.print("Option: ");
            int opcio = sc.nextInt();

            switch (opcio) {
                case 1:
                    pm.newPlayer();
                    break;
                case 2:
                    pm.delPlayer();
                    break;
                case 3:
                    System.out.println(pm.searchPlayerName());
                    break;
                case 4:
                    pm.updateScore();
                    break;
                case 5:
                    System.out.print("Enter the number of top players to show: ");
                    int n = sc.nextInt();
                    pm.showTopNPlayersByScore(n);
                    break;
                case 6:
                    System.out.print("Enter the minimum score: ");
                    int minScore = sc.nextInt();
                    pm.showPlayersAboveScore(minScore);
                    break;
                case 7:
                    pm.showHighestScoringPlayer();
                    break;
                case 8:
                    pm.allPlayers();
                    break;
                case 9:
                    continuar = false;

            }
        }
    }
}
