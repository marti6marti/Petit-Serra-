package ex9;


import java.util.ArrayList;
import java.util.Scanner;

public class Game {
//    private static Player[] players = new Player[10];
    static ArrayList<Player> players = new ArrayList<Player>();

    private int playerCount = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Game game = new Game();

        String option;

        do {
            System.out.println("\nMenú:");
            System.out.println("a. Afegir nou jugador");
            System.out.println("b. Eliminar jugador");
            System.out.println("c. Reset de la partida");
            System.out.println("d. Mostrar jugadors");
            System.out.println("e. Sortir");
            System.out.print("Trieu una opció: ");
            option = scanner.next();
            scanner.nextLine();

            switch (option) {
                case "a":
                    game.addPlayer(scanner);
                    break;
                case "b":
                    game.removePlayer();
                    break;
                case "c":
                    game.resetGame();
                    break;
                case "d":
                    game.displayPlayers();
                    break;
                case "e":
                    System.out.println("Sortint del joc...");
                    break;
                default:
                    System.out.println("Opció no vàlida. Torneu-ho a intentar.");
            }
        } while (option != "e");

    }

    private void addPlayer(Scanner scanner) {
        if (players.size() <= 10) {
            System.out.println("Error: No es poden afegir més jugadors. El màxim és " + players.size() + ".");
            return;
        }

        System.out.print("Introduïu el nom del jugador: ");
        String name = scanner.nextLine();
        System.out.print("Introduïu la coordenada x: ");
        int x = scanner.nextInt();
        System.out.print("Introduïu la coordenada y: ");
        int y = scanner.nextInt();
        scanner.nextLine();

        Position position = new Position(x, y);
        players.add(new Player(position, name));
        players.set(players.size()+1, new Player(position, name));
        System.out.println("Jugador " + name + " afegit amb èxit.");
    }


    private void removePlayer() {
        if (players.isEmpty()) {
            System.out.println("No hi ha jugadors per eliminar.");
            return;
        } else {
            System.out.println("Jugador " + players.get(players.size() - 1).getName() + " eliminat.");
            players.set(players.size()-1, null);
        }
    }

    private void resetGame() {
        players = new ArrayList<>();
        playerCount = 0;
        System.out.println("Partida reiniciada. Tots els jugadors han estat eliminats.");
    }


    private void displayPlayers() {
        if (playerCount == 0) {
            System.out.println("No hi ha jugadors per mostrar.");
            return;
        }
        System.out.println("Jugadors:");
        for (int i = 0; i < playerCount; i++) {
            System.out.println(players.get(i));
        }
    }
}