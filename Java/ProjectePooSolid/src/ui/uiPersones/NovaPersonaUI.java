package ui.uiPersones;

import model.institute.Institut;
import service.servicePersones.NewPersona;
import service.servicePersones.NovaPersona;

import java.util.Scanner;

public class NovaPersonaUI implements NewPersona {
    private Scanner scanner = new Scanner(System.in);
    private NovaPersona novaPersona = new NovaPersona();

    public void novaPersona(Institut ins) {
        mostrarMenuTipusPersona();
        int opcio = scanner.nextInt();
        scanner.nextLine();

        boolean resultat = false;

        switch (opcio) {
            case 1:
                resultat = crearAlumne(ins);
                break;
            case 2:
                resultat = crearProfessor(ins);
                break;
            case 3:
                resultat = crearPersonaExterna(ins);
                break;
            default:
                System.out.println("Opció no vàlida.");
        }

        if (resultat) {
            System.out.println("Operació realitzada amb èxit.");
        } else {
            System.out.println("Error en realitzar l'operació.");
        }
    }

    private void mostrarMenuTipusPersona() {
        System.out.println("\nQuin tipus de persona vols crear?");
        System.out.println("1. Alumne");
        System.out.println("2. Professor");
        System.out.println("3. Persona Externa");
        System.out.print("Opció: ");
    }

    private boolean crearAlumne(Institut ins) {
        System.out.println("\nCreació d'Alumne:");
        System.out.print("Nom: ");
        String nom = scanner.nextLine();

        System.out.print("Telèfon: ");
        int telefon = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Curs: ");
        String curs = scanner.nextLine();

        return novaPersona.crearAlumne(ins, nom, telefon, curs);
    }

    private boolean crearProfessor(Institut ins) {
        System.out.println("\nCreació de Professor:");
        System.out.print("Nom: ");
        String nom = scanner.nextLine();

        System.out.print("Telèfon: ");
        int telefon = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Matèria: ");
        String materia = scanner.nextLine();

        return novaPersona.crearProfessor(ins, nom, telefon, materia);
    }

    private boolean crearPersonaExterna(Institut ins) {
        System.out.println("\nCreació de Persona Externa:");
        System.out.print("Nom: ");
        String nom = scanner.nextLine();

        System.out.print("Telèfon: ");
        int telefon = scanner.nextInt();
        scanner.nextLine();

        return novaPersona.crearPersonaExterna(ins, nom, telefon);
    }
}