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
            System.out.println("1. add a player to the list.");
            System.out.println("2. remove a player from the list based on the player's name.");
            System.out.println("3. return player based on playername");
            System.out.println("4. update a player's score");
            System.out.println("5. Tots els vaixells actuals (de més vell a més nou)");
            System.out.println("6. Tots els vaixells actuals (per ordre lexicogràfic)");
            System.out.println("7. Tots els vaixells actuals (de car a barat)");
            System.out.println();
            System.out.println("9. show all current players");
            System.out.println("10. Exit");
            System.out.print("Opció: ");
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

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:
                    break;
                case 9:
                    pm.allPlayers();
                    break;
                case 10:
                    continuar = false;

            }
        }
    }
}
