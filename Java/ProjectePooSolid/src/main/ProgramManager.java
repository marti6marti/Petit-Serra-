package main;

import model.booking.Reserva;
import model.institute.Institut;
import model.person.Alumne;
import model.person.PersonaExterna;
import model.person.Profesor;
import model.space.Espai;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ProgramManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        Institut poblenou = new Institut("Poblenou");

        Espai biblioteca = new Espai("Biblioteca", 10);
        Espai aulaReunions = new Espai("Aula de reunions", 2.5);
        Espai menjador = new Espai("Menjador", 15);

        poblenou.addEspai(biblioteca);
        poblenou.addEspai(aulaReunions);
        poblenou.addEspai(menjador);

        Alumne alumne1 = new Alumne("Martí", 123456789, "2º ESO");
        Profesor profesor1 = new Profesor("Joan", 987654321, "Matemàticas");
        PersonaExterna visitant1 = new PersonaExterna("Miquel", 567890123);
        
        poblenou.addPersona(alumne1);
        poblenou.addPersona(profesor1);
        poblenou.addPersona(visitant1);

        Reserva reserva1 = new Reserva(333,alumne1, biblioteca, LocalDateTime.of(2025, 1, 9, 15, 0), LocalDateTime.of(2025, 1, 9, 17, 0));
        Reserva reserva2 = new Reserva(666,profesor1, menjador, LocalDateTime.of(2025, 1, 10, 9, 0), LocalDateTime.of(2025, 1, 10, 10, 0));
        poblenou.addReserva(reserva1);
        poblenou.addReserva(reserva2);



        boolean continuar = true;
        while (continuar) {

            System.out.println("\nMenú del Institut:");
            System.out.println("1. Espais disponibles");
            System.out.println("2. Mostra totes les resrves");
            System.out.println("5. Buscar reserves a partir del nom d'una persona");

            System.out.println("3. Registre't");
            System.out.println("4. Fer una reserva");
            System.out.println("6. Anular reserva");

            System.out.println("7. Sortir");
            System.out.print("Opció: ");
            int opcio = scanner.nextInt();

            switch (opcio) {
                case 1:
            }

            continuar = false;
        }
    }
}
