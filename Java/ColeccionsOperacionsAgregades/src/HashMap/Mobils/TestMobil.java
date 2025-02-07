package HashMap.Mobils;

import java.util.Scanner;

public class TestMobil {
    public static void main(String[] args) {
        ConjuntManager manager = new ConjuntManager();
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nGestió de Mòbils:");
            System.out.println("1. Afegir un mòbil");
            System.out.println("2. Eliminar un mòbil");
            System.out.println("3. Cercar un mòbil per DNI");
            System.out.println("4. Cercar el DNI per número de mòbil");
            System.out.println("5. Sortir");
            System.out.print("Opció: ");
            int opcio = sc.nextInt();

            switch (opcio) {
                case 1:
                    manager.newMobil();
                    break;
                case 2:
                    manager.removeMobil();
                    break;
                case 3:
                    manager.searchMobilByDni();
                    break;
                case 4:
                    manager.searchDniByNumber();
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Sortint del programa...");
            }
        }
    }
}
