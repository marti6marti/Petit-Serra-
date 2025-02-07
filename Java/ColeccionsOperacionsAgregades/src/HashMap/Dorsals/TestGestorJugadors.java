package HashMap.Dorsals;

import java.util.Scanner;

public class TestGestorJugadors {
    public static void main(String[] args) {

        GestorJugadors gestor = new GestorJugadors();
        gestor.afegirJugador(10, new Jugador("Messi", 36, "Davanter"));
        gestor.afegirJugador(1, new Jugador("Ter Stegen", 31, "Porter"));
        gestor.afegirJugador(3, new Jugador("Piqué", 37, "Defensa"));
        gestor.afegirJugador(5, new Jugador("Busquets", 35, "Migcampista"));
        gestor.afegirJugador(7, new Jugador("Griezmann", 32, "Davanter"));


        Scanner sc = new Scanner(System.in);
        int opcio;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Afegir jugador");
            System.out.println("2. Buscar jugador per dorsal");
            System.out.println("3. Buscar jugador per nom");
            System.out.println("4. Llistar jugadors per número de dorsal");
            System.out.println("5. Llistar jugadors per edat");
            System.out.println("6. Llistar jugadors per posició");
            System.out.println("7. Sortir");
            System.out.print("Escull una opció: ");

            opcio = sc.nextInt();
            sc.nextLine();

            switch (opcio) {
                case 1:
                    System.out.print("Introdueix el dorsal: ");
                    int dorsal = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Introdueix el nom: ");
                    String nom = sc.nextLine();

                    System.out.print("Introdueix l'edat: ");
                    int edat = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Introdueix la posició: ");
                    String posicio = sc.nextLine();

                    gestor.afegirJugador(dorsal, new Jugador(nom, edat, posicio));
                    break;

                case 2:
                    System.out.print("Introdueix el dorsal del jugador: ");
                    int dorsalBuscar = sc.nextInt();
                    gestor.obtenirJugadorPerDorsal(dorsalBuscar);
                    break;

                case 3:
                    System.out.print("Introdueix el nom del jugador: ");
                    String nomBuscar = sc.nextLine();
                    gestor.obtenirJugadorsPerNom(nomBuscar);
                    break;

                case 4:
                    gestor.mostrarTotsElsJugadors();
                    break;

                case 5:
                    gestor.mostrarJugadorsPerEdat();
                    break;

                case 6:
                    gestor.mostrarJugadorsPerPosicio();
                    break;

                case 7:
                    System.out.println("Sortint del programa...");
            }
        } while (opcio != 7);
    }
}