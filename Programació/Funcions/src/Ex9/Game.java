package Ex9;

import java.util.Scanner;

public class Game {
    private static Player[] players = new Player[10];
    private static int playerCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                    addPlayer(scanner);
                    break;
                case "b":
                    removePlayer();
                    break;
                case "c":
                    resetGame();
                    break;
                case "d":
                    displayPlayers();
                    break;
                case "e":
                    System.out.println("Sortint del joc...");
                    break;
                default:
                    System.out.println("Opció no vàlida. Torneu-ho a intentar.");
            }
        } while (option != "e");

        scanner.close();
    }

    private static void addPlayer(Scanner scanner) {
        if (playerCount >= players.length) {
            System.out.println("Error: No es poden afegir més jugadors. El màxim és " + players.length + ".");
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
        players[playerCount++] = new Player(position, name);
        System.out.println("Jugador " + name + " afegit amb èxit.");
    }


    private static void removePlayer() {
        if (playerCount == 0) {
            System.out.println("No hi ha jugadors per eliminar.");
            return;
        }
        System.out.println("Jugador " + players[playerCount - 1].getName() + " eliminat.");
        players[--playerCount] = null;
    }

    private static void resetGame() {
        players = new Player[10];
        playerCount = 0;
        System.out.println("Partida reiniciada. Tots els jugadors han estat eliminats.");
    }


    private static void displayPlayers() {
        if (playerCount == 0) {
            System.out.println("No hi ha jugadors per mostrar.");
            return;
        }
        System.out.println("Jugadors:");
        for (int i = 0; i < playerCount; i++) {
            System.out.println(players[i]);
        }
    }
}