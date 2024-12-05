package ex9;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private ArrayList<Player> players = new ArrayList<>();

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
        } while (!option.equals("e")); // Usando equals para comparar Strings
    }

    private void addPlayer(Scanner scanner) {
        if (players.size() >= 10) { // Verificar si el número máximo de jugadores ha sido alcanzado
            System.out.println("Error: No es poden afegir més jugadors. El màxim és 10.");
            return;
        }

        System.out.print("Introduïu el nom del jugador: ");
        String name = scanner.nextLine();
        System.out.print("Introduïu la coordenada x: ");
        int x = scanner.nextInt();
        System.out.print("Introduïu la coordenada y: ");
        int y = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Position position = new Position(x, y);
        players.add(new Player(position, name)); // Agregar el nuevo jugador a la lista
        System.out.println("Jugador " + name + " afegit amb èxit.");
    }

    private void removePlayer() {
        if (players.isEmpty()) {
            System.out.println("No hi ha jugadors per eliminar.");
            return;
        }
        System.out.println("Jugador " + players.remove(players.size() - 1) + " eliminat amb èxit.");
    }

    private void resetGame() {
        players.clear();
        System.out.println("La partida ha estat reiniciada. Tots els jugadors han estat eliminats.");
    }

    private void displayPlayers() {
        if (players.isEmpty()) {
            System.out.println("No hi ha jugadors per mostrar.");
            return;
        }
        System.out.println("Jugadors actuals:");
        for (Player player : players) {
            System.out.println(player);
        }
    }
}