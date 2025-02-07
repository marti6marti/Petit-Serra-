package HashSet.SCRUM;

import java.util.Scanner;

public class TestSCRUM {
    public static void main(String[] args) {
        SCRUMManager scrumManager = new SCRUMManager();
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menú SCRUM:");
            System.out.println("1. Introduir una tasca");
            System.out.println("2. Passar de TO BE DONE a DOING");
            System.out.println("3. Passar de DOING a DONE");
            System.out.println("4. Mostrar l'estat actual de les tasques");
            System.out.println("5. Sortir");
            System.out.print("Opció: ");
            int opcio = sc.nextInt();
            sc.nextLine();

            switch (opcio) {
                case 1:
                    System.out.print("Nom de la tasca: ");
                    String nom = sc.nextLine();
                    System.out.print("Descripció de la tasca: ");
                    String descripcio = sc.nextLine();
                    scrumManager.afegirTasca(nom, descripcio);
                    break;
                case 2:
                    System.out.print("Nom de la tasca a passar a DOING: ");
                    String tascaToDoing = sc.nextLine();
                    scrumManager.passarDeToBeDoneADoing(tascaToDoing);
                    break;
                case 3:
                    System.out.print("Nom de la tasca a passar a DONE: ");
                    String tascaToDone = sc.nextLine();
                    scrumManager.passarDeDoingADone(tascaToDone);
                    break;
                case 4:
                    scrumManager.mostrarEstat();
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Sortint del programa...");
            }
        }
    }
}
