package ui;

import model.booking.Reserva;
import model.institute.Institut;
import model.person.Alumne;
import model.person.PersonaExterna;
import model.person.Profesor;
import model.space.Espai;
import service.serviceEspais.MostraEspais;
import service.servicePersones.MostraPersones;
import service.servicePersones.NovaPersona;
import service.serviceReserva.BorrarReserva;
import service.serviceReserva.BuscarReservesNom;
import service.serviceReserva.MostraReserves;
import service.serviceReserva.NovaReserva;
import ui.uiPersones.NovaPersonaUI;
import ui.uiReserva.BorrarReservaUI;
import ui.uiReserva.BuscarReservesNomUI;
import ui.uiReserva.NovaReservaUI;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ProgramManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MostraEspais mostraEspais = new MostraEspais();
        MostraReserves mostraReserves = new MostraReserves();
        MostraPersones mostraPersones = new MostraPersones();

        BuscarReservesNomUI buscador = new BuscarReservesNomUI();

        NovaPersonaUI novaPersonaUI = new NovaPersonaUI();
        NovaReservaUI novaReservaUI = new NovaReservaUI();
        BorrarReservaUI borrarReservaUI = new BorrarReservaUI();

        Institut ins1 = new Institut("Poblenou");

        Espai biblioteca = new Espai("Biblioteca", 10);
        Espai aulaReunions = new Espai("Aula de reunions", 2.5);
        Espai menjador = new Espai("Menjador", 15);

        ins1.addEspai(biblioteca);
        ins1.addEspai(aulaReunions);
        ins1.addEspai(menjador);

        Alumne alumne1 = new Alumne("Martí", 123456789, "2º ESO");
        Profesor profesor1 = new Profesor("Joan", 987654321, "Matemàticas");
        PersonaExterna visitant1 = new PersonaExterna("Miquel", 567890123);

        ins1.addPersona(alumne1);
        ins1.addPersona(profesor1);
        ins1.addPersona(visitant1);

        Reserva reserva1 = new Reserva(333,alumne1, biblioteca, LocalDateTime.of(2025, 1, 9, 15, 0), LocalDateTime.of(2025, 1, 9, 17, 0));
        Reserva reserva2 = new Reserva(666,profesor1, menjador, LocalDateTime.of(2025, 1, 10, 9, 0), LocalDateTime.of(2025, 1, 10, 10, 0));
        ins1.addReserva(reserva1);
        ins1.addReserva(reserva2);



        boolean continuar = true;
        while (continuar) {

            System.out.println("\nMenú del Institut: " + ins1.getNom());
            System.out.println("1. Mostra Espais");
            System.out.println("2. Mostra Persones");
            System.out.println("3. Mostra Reserves");

            System.out.println("4. Buscar reserves a partir del nom d'una persona");

            System.out.println("5. Registre't");
            System.out.println("6. Fer una reserva");
            System.out.println("7. Anular reserva");

            System.out.println("8. Sortir");
            System.out.print("Opció: ");

            int opcio = scanner.nextInt();

            switch (opcio) {
                case 1:
                    mostraEspais.mostrarespais(ins1);
                    break;
                case 2:
                    mostraPersones.mostrapersones(ins1);
                    break;
                case 3:
                    mostraReserves.mostrareservas(ins1);
                    break;
                case 4:
                    buscador.buscarReservesNom(ins1);
                    break;
                case 5:
                    novaPersonaUI.novaPersona(ins1);
                    break;
                case 6:
                    novaReservaUI.novaReserva(ins1);
                    break;
                case 7:
                    borrarReservaUI.borrarReserva(ins1);
                    break;
                case 8:
                    continuar = false;
                    break;
                default:
                    System.out.println("-----------------------------------");
                    System.out.println("Aquest valor no existeix en el menú");
                    System.out.println("-----------------------------------");
            }
        }
    }
}
