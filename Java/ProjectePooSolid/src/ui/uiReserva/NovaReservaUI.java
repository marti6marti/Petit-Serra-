package ui.uiReserva;

import model.institute.Institut;
import model.person.Persona;
import model.space.Espai;
import service.serviceEspais.MostraEspais;
import service.serviceReserva.NewReserva;
import service.serviceReserva.NovaReserva;

import java.time.LocalDateTime;
import java.util.Scanner;

public class NovaReservaUI implements NewReserva {
    private Scanner scanner = new Scanner(System.in);
    private NovaReserva novaReserva = new NovaReserva();
    private MostraEspais mostraEspais = new MostraEspais();

    public void novaReserva(Institut ins) {
        // Obtenir ID
        System.out.println("Introdueix un ID per la teva reserva:");
        int id = scanner.nextInt();
        scanner.nextLine();

        // Selecció de persona
        Persona persona = seleccionarPersona(ins);
        if (persona == null) {
            System.out.println("Persona no trobada.");
            return;
        }

        // Selecció d'espai
        Espai espai = seleccionarEspai(ins);
        if (espai == null) {
            System.out.println("Espai no trobat.");
            return;
        }

        // Dates
        LocalDateTime entrada = obtenirDataHora("d'entrada");
        LocalDateTime sortida = obtenirDataHora("de sortida");

        // Verificar disponibilitat
        if (!novaReserva.verificarDisponibilitat(ins, espai, entrada, sortida)) {
            System.out.println("Aquestes dates ja tenen una reserva assignada.");
            return;
        }

        // Crear reserva
        if (novaReserva.crearReserva(ins, id, persona, espai, entrada, sortida)) {
            System.out.println("Reserva realitzada amb èxit.");
        } else {
            System.out.println("Error en crear la reserva.");
        }
    }

    private Persona seleccionarPersona(Institut ins) {
        System.out.println("Qui fa la reserva?");
        System.out.println("1. Alumne");
        System.out.println("2. Professor");
        System.out.println("3. Persona Externa");
        int opcioPersona = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introdueix el nom:");
        String nom = scanner.nextLine();

        if (opcioPersona == 3) {
            System.out.println("ATENCIÓ: Com que no està matriculat al centre, haurà de pagar 5€ per cada reserva.");
            System.out.println("Gràcies per fer ús de les nostres instal·lacions.");
        }

        return novaReserva.buscarPersona(ins, nom);
    }

    private Espai seleccionarEspai(Institut ins) {
        System.out.println("Espais disponibles:");
        mostraEspais.mostrarespais(ins);

        System.out.println("Selecciona un espai per fer la reserva:");
        String nomEspai = scanner.nextLine();

        return novaReserva.buscarEspai(ins, nomEspai);
    }

    private LocalDateTime obtenirDataHora(String moment) {
        System.out.println("Introdueix l'any de " + moment + ":");
        int any = scanner.nextInt();
        System.out.println("Introdueix el mes de " + moment + " (1-12):");
        int mes = scanner.nextInt();
        System.out.println("Introdueix el dia de " + moment + ":");
        int dia = scanner.nextInt();
        System.out.println("Introdueix l'hora de " + moment + " (0-23):");
        int hora = scanner.nextInt();
        System.out.println("Introdueix els minuts de " + moment + ":");
        int min = scanner.nextInt();
        scanner.nextLine();

        return LocalDateTime.of(any, mes, dia, hora, min);
    }
}
